package osp.leobert.android.lint.sceneray

import com.android.tools.lint.detector.api.*
import com.android.tools.lint.detector.api.Category.Companion.CORRECTNESS
import com.android.tools.lint.detector.api.Scope.Companion.JAVA_FILE_SCOPE
import com.intellij.psi.JavaElementVisitor
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiMethodCallExpression

/**
 * <p><b>Package:</b> osp.leobert.android.lint.sceneray </p>
 * <p><b>Project:</b> CustomLintRules </p>
 * <p><b>Classname:</b> FileLogUsageDetector </p>
 * <p><b>Description:</b> TODO </p>
 * Created by leobert on 2021/6/30.
 */
class FileLogUsageDetector : Detector(), Detector.UastScanner {
    companion object {

        val issueFileLogUsage: Issue = Issue.create(
            id = "FileLogUsage",
            briefDescription = "find FileLog usage",
            explanation = "find FileLog usage, check it is appropriate",
            category = CORRECTNESS,
            priority = 10,
            severity = Severity.WARNING,
            implementation = Implementation(
                FileLogUsageDetector::class.java,
                JAVA_FILE_SCOPE)
        )

        val methods = arrayListOf("e", "w", "d", "i")

        val ctName = "com.sceneraymedical.sceneray.utils.FileLog"
    }

    override fun getApplicableMethodNames(): List<String>? {
        return methods
    }

    override fun visitMethod(
        context: JavaContext, visitor: JavaElementVisitor?,
        call: PsiMethodCallExpression, method: PsiMethod,
    ) {


        val ifFileLogCall = context.evaluator.isMemberInClass(method, ctName)

        if (ifFileLogCall && methods.contains(method.name)) {
            context.report(issue = issueFileLogUsage,
                scope = call,
                location = context.getLocation(call),
                message = "find FileLog usage, check it is appropriate")
        }
    }
}