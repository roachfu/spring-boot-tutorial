drop table if exists t_demo;
create table t_demo(
  id int not null auto_increment,
  demo_name varchar(16) not null default '' comment 'demo名称',
  demo_value varchar(16) not null default '' comment 'demo 值',
  demo_status tinyint unsigned not null default 1 comment 'demo状态：1=正常，2=屏蔽',
  create_time datetime not null default now() comment '创建时间',
  update_time datetime not null default now() comment '更新时间',
  primary key (id)
)engine=innodb default charset=utf8;
