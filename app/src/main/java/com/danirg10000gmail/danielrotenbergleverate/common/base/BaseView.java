package com.danirg10000gmail.danielrotenbergleverate.common.base;

/**
 * Created by DanielR on 07/07/2017.
 */

public interface BaseView<T extends BasePresenter> {

  void setPresenter(T presenter);
}
