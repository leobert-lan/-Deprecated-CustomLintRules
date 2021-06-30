package osp.leobert.android.lint.demo

import com.sceneraymedical.sceneray.utils.FileLog

/**
 * <p><b>Package:</b> osp.leobert.android.lint.demo </p>
 * <p><b>Project:</b> CustomLintRules </p>
 * <p><b>Classname:</b> Test </p>
 * <p><b>Description:</b> TODO </p>
 * Created by leobert on 2021/6/30.
 */
class Test {
    // We have a custom lint check bundled with :library
    // that this module depends on. The lint check looks
    // for mentions of "lint", which should trigger an
    // error
    val s = "lint"
    fun lint() { }
    fun aaa() {
        FileLog.e("a", "b")
    }
}