package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Category;
import java.util.List;
import com.how2java.tmall.util.Page;

public interface CategoryMapper {
    public List<Category> list(Page page);

    public int total();

    void add(Category category);

    void delete(int id);
}
