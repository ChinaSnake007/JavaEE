package com.yang.pojo;

public class Hero{
        String name1;
        String title;
        String address;
        public String getName1(){
            return name1;
        }
        public void setName1(String name1){
            this.name1 = name1;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public String toString(){
            return "Hero{"+"name1="+'\''+name1.replace(" ","")+'\''+",title="+'\''+title.replace(" ","")+'\''+",address="+'\''+address.replace(" ","")+'\''+'}';
        }
    }