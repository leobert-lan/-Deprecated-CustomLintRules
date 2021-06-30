package osp.leobert.android.lint.sceneray

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue

/**
 * <p><b>Package:</b> osp.leobert.android.lint.sceneray </p>
 * <p><b>Project:</b> CustomLintRules </p>
 * <p><b>Classname:</b> ScenerayIssueRegistry </p>
 * Created by leobert on 2021/6/30.
 */
class ScenerayIssueRegistry : IssueRegistry() {

    init {
        println("ScenerayIssueRegistry")
    }

    override val issues: List<Issue>
        get() = arrayListOf(
            FileLogUsageDetector.issueFileLogUsage,
//            SampleCodeDetector.ISSUE
        )

    override val api: Int
        get() = CURRENT_API

    override val minApi: Int
        get() = 8 // works with Studio 4.1 or later; see com.android.tools.lint.detector.api.Api / ApiKt

//    // Requires lint API 30.0+; if you're still building for something
//    // older, just remove this property.
//    override val vendor: Vendor = Vendor(
//        vendorName = "Android Open Source Project",
//        feedbackUrl = "https://github.com/googlesamples/android-custom-lint-rules/issues",
//        contact = "https://github.com/googlesamples/android-custom-lint-rules"
//    )
}