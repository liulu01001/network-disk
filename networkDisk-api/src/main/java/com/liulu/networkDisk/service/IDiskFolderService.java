package com.liulu.networkDisk.service;


import com.liulu.networkDisk.model.DiskFolderModel;

/**
 * @auther Liu_lu
 * @date 2019/3/30 16:38
 */
public interface IDiskFolderService {

    /**
     * 创建文件夹
     *
     * @param diskFolderModel
     * @return
     */
    Boolean insertDiskFolder(DiskFolderModel diskFolderModel);

    /**
     * 删除文件夹
     * @param id
     * @return
     */
    Boolean deleteDiskFolder(String id);

    /**
     * 修改文件夹
     * @param diskFolderModel
     * @return
     */
    Boolean updateDiskFolder(DiskFolderModel diskFolderModel);


}
