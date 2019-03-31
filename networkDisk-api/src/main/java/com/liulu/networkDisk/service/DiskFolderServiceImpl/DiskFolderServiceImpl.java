package com.liulu.networkDisk.service.DiskFolderServiceImpl;

import com.liulu.networkDisk.mapper.DiskFolderModelMapper;
import com.liulu.networkDisk.model.DiskFolderModel;
import com.liulu.networkDisk.service.IDiskFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Liu_lu
 * @date 2019/3/30 16:48
 */
@Service
public class DiskFolderServiceImpl implements IDiskFolderService {

    @Autowired
    private DiskFolderModelMapper diskFolderModelMapper;

    @Override
    public Boolean insertDiskFolder(DiskFolderModel diskFolderModel) {

        int insert = diskFolderModelMapper.insert(diskFolderModel);
        return null;

    }

    @Override
    public Boolean deleteDiskFolder(String id) {
        return null;
    }

    @Override
    public Boolean updateDiskFolder(DiskFolderModel diskFolderModel) {
        return null;
    }
}
