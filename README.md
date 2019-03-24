# 关于布局的三种方式以及实现按钮页面跳转  
## 线性布局  
使用的是&lt;LinearLayout&gt;&lt;/LinearLayout&gt;标签，效果如下图  
![LinearLayout](https://github.com/ishy6/Layout/blob/master/image/Linealayout.PNG)
## 相对布局  
使用的是&lt;RelativeLayout&gt;&lt;/RelativeLayout&gt;标签，效果如下图  
![RelativeLayout](https://github.com/ishy6/Layout/blob/master/image/RelativeLayout.PNG)
## 表格布局  
使用的是&lt;TableLayout&gt;&lt;/TableLayout&gt;标签，效果如下图  
![Tablelayout](https://github.com/ishy6/Layout/blob/master/image/Tablelayout.PNG)
## 使用按钮实现跳转  
1.需要在按钮加上id属性  
![id](https://github.com/ishy6/Layout/blob/master/image/%E6%8C%89%E9%92%AE1.PNG)  
2.在该layout对应的java文件中找到Oncreate方法，并加入以下代码  
```Button btn2=(Button)findViewById(R.id.btn2);

        //给btn2绑定监听事件
        btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // 给bnt2添加点击响应事件
                Intent intent =new Intent(RelativeLayout.this,TableLayout.class);
                //启动
                startActivity(intent);
            }
        });
```

3.至此实现了页面跳转
