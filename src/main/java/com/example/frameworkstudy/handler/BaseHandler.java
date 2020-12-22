package com.example.frameworkstudy.handler;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.store.tianmao.common.PageCons;
import com.store.tianmao.common.session.IdGenerator;
import com.store.tianmao.common.session.SessionFactroy;
import com.store.tianmao.util.AntiSQLFilter;
import com.store.tianmao.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;


public class BaseHandler {
    @Autowired
    protected SessionFactroy sessionFactroy;
    @Autowired
//    @Qualifier("contructIdGen")
    protected IdGenerator idGenerator;
    @Autowired
    protected HttpServletRequest request;



    protected <T> Page<T> getPage() {
        return getPage(false);
    }

    protected <T> Page<T> getPage(boolean openSort) {
        int index = 1;
        // 页数
        Integer cursor = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_PAGE), index);
        // 分页大小
        Integer limit = TypeUtils.castToInt(request.getParameter(PageCons.PAGE_ROWS), PageCons.DEFAULT_LIMIT);
        // 是否查询分页
        Boolean searchCount = TypeUtils.castToBoolean(request.getParameter(PageCons.SEARCH_COUNT), true);
        limit = limit > PageCons.MAX_LIMIT ? PageCons.MAX_LIMIT : limit;
        Page<T> page = new Page<>(cursor, limit, searchCount);
        if (openSort) {
            page.setAsc(getParameterSafeValues(PageCons.PAGE_ASCS));
            page.setDesc(getParameterSafeValues(PageCons.PAGE_DESCS));
        }
        return page;
    }
    protected String generateId(){
        return String.valueOf(idGenerator.nextId());
    }
    protected String[] getParameterSafeValues(String parameter) {
        return AntiSQLFilter.getSafeValues(request.getParameterValues(parameter));
    }
}
