package pers.jiangyu.mvp.base

import pers.jiangyu.mvp.base.impl.BasePresenterImpl

/**
 * Created by whale on 2019-11-09 13:16
 */
open class BaseModel<P : BasePresenterImpl>(protected var  presenter :P?) {
}