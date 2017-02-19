package com.example.myapplication.presenter;

import com.example.myapplication.bean.youdaobean.YouDaoBean;

import java.util.List;

/**
 * Created by 李思言 on 2016/11/13.
 */

public interface ITranslatePresenter extends BasePresenter {


    //更新数据
    void getGlossary(String word);

    //增添数据

    void addHistorySql(YouDaoBean youDaoBean);

    //查询数据

    void getHistorySql(String word);


    List loadHistoryData();

    //删除数据

    void deleteHistorySql(String word);

}
