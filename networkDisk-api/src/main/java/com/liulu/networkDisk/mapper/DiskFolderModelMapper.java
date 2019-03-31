package com.liulu.networkDisk.mapper;

import com.liulu.networkDisk.model.DiskFolderModel;

public interface DiskFolderModelMapper {
    int deleteByPrimaryKey(String userDirId);

    int insert(DiskFolderModel record);

    int insertSelective(DiskFolderModel record);

    DiskFolderModel selectByPrimaryKey(String userDirId);

    int updateByPrimaryKeySelective(DiskFolderModel record);

    int updateByPrimaryKey(DiskFolderModel record);
}