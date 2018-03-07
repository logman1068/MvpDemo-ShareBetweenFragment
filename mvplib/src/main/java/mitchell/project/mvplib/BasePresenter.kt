package mitchell.project.mvplib

/**
 * Presenter 父类
 */
open class BasePresenter<V : IMvpView> {
    open var view: V? = null

    /**
     * 绑定View
     */
    fun attachView(view: V) {
        this.view = view
    }

    /**
     * 分离View
     */
    fun detachView() {
        this.view = null
    }
}