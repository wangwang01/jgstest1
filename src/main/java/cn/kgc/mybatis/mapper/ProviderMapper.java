package cn.kgc.mybatis.mapper;

import cn.kgc.mybatis.bean.Provider;

import java.util.List;

public interface ProviderMapper {
    public Integer getProviderCount();

    public List<Provider> getProviderList();
}
