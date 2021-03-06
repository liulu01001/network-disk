--  -------------------------------------------------- 
--  Generated by Enterprise Architect Version 11.0.1106
--  Created On : 星期六, 30 三月, 2019 
--  DBMS       : MySql 
--  -------------------------------------------------- 

DROP TABLE IF EXISTS disk_file CASCADE
;
CREATE TABLE disk_file
(
	file_id NVARCHAR(36) NOT NULL COMMENT '文件id',
	file_name NVARCHAR(200) NULL COMMENT '文件名',
	file_dir_id NVARCHAR(36) NULL COMMENT '文件指定文件夹id',
	file_type CHAR(10) NULL COMMENT '文件类型',
	file_upload_time DATE NULL COMMENT '文件上传时间',
	user_id NVARCHAR(36) NULL COMMENT '用户id',
	file_size FLOAT(11,2) NULL COMMENT '文件大小',
	file_download_time DATE NULL COMMENT '文件下载时间',
	file_download_number INT NULL COMMENT '下载次数',
	PRIMARY KEY (file_id)

)  COMMENT='文件'
;


