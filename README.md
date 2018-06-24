# SpringBootWithDocker
```Run SpringBoot Project ,run docker images while whole develop timeline
   set DOCKER_HOST=tcp://192.168.45.137:2376
   ```
```
   建表：
   CREATE TABLE ticket (id integer, targetcity varchar(255),startcity varchar(255),    targetdate date,startdate date,classtype  varchar(255),    retuencode integer,retueninfo  varchar(255),retuenremark  varchar(255));
   ALTER TABLE ticket ADD CONSTRAINT pk_id PRIMARY KEY(id);
   alter table ticket change id id int AUTO_INCREMENT;
```


