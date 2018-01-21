package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import java.util.List;
import com.how2java.tmall.util.Page;

public interface CategoryService{
    int total();
    List<Category> list(Page page);
    void add(Category category);
    void delete(int id);
}