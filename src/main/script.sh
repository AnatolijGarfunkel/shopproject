#!/bin/bash



 touch file0.txt
 mkdir -p /tmp/user/181223_evening/anatolij/
 
	for i in {1..4}
	do 
	mkdir -p /tmp/user/181223_evening/anatolij/DATE0$i/
	done

 mv file0.txt /tmp/user/181223_evening/anatolij/DATE01/
 cat /var/lib/dhcpcd/eth0.lease | tail -3 | grep bash: > /tmp/user/181223_evening/anatolij/DATE02/1.txt
 free -h | sed 's/buff/    /' > /tmp/user/181223_evening/anatolij/DATE03/2.txt
 mkdir -p /tmp/user/181223_evening/anatolij/DATE_04/

	for i in {0..9}
	do 
	touch /tmp/user/181223_evening/anatolij/DATE_04/test0$i.txt
	done
# set -e не использовал, так как в писочнице в комманде free нет ключа -h, и скрипт до конца не отрабатывает.
# возможно опечатка, и под папкой в 16 строке подразумевалась DATE04, но решил прописать, как в ТЗ было указано.
