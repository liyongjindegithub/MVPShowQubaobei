package com.lyj.six_day04.model;

import java.util.List;

public class Base {

    /**
     * ret : 1
     * data : [{"id":"2724","title":"芋儿烧肉","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2724.jpg","collect_num":"66","food_str":"猪肉 芋儿 油 豆瓣 姜","num":66},{"id":"67","title":"豆沙卷面包","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/1/67.jpg","collect_num":"66","food_str":"高筋面粉 红豆沙 水 干酵母 细砂糖","num":66},{"id":"56277","title":"开花紫薯包","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/57/56277.jpg","collect_num":"66","food_str":"低筋面粉 紫薯 泡打粉 细砂糖 水","num":66},{"id":"57560","title":"红珍珠椰露冰","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/58/57560.jpg","collect_num":"65","food_str":"荸荠 甜菜根汁 玉米淀粉 椰浆 砂糖","num":65},{"id":"27031","title":"杏鲍菇香肠杂烩披萨","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/28/27031.jpg","collect_num":"64","food_str":"高粉 低粉 糖 酵母粉 盐","num":64},{"id":"77505","title":"香煎培根金针菇卷","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/78/77505.jpg","collect_num":"64","food_str":"培根 金针菇 黑胡椒碎 熟白芝麻","num":64},{"id":"2677","title":"毛豆炒肉丁","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2677.jpg","collect_num":"64","food_str":"毛豆 肉丁 盐 味精 芡粉","num":64},{"id":"2613","title":"苹果煮猪肉","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2613.jpg","collect_num":"64","food_str":"猪肉 苹果 洋葱 迷你番茄 芦笋","num":64},{"id":"2750","title":"豆豉肉片烧冬瓜","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2750.jpg","collect_num":"64","food_str":"冬瓜 肉片 豆豉 油 盐","num":64},{"id":"15420","title":"百福玉满堂","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/16/15420.jpg","collect_num":"63","food_str":"口蘑 香菇 北豆腐 鸡蛋 猪肉馅","num":63},{"id":"10394","title":"油焖春笋","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10394.jpg","collect_num":"63","food_str":"春笋 高汤 生抽 老抽 糖","num":63},{"id":"64527","title":"西葫芦虾干饺子","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/65/64527.jpg","collect_num":"63","food_str":"西葫芦 泡发黑木耳 绿豆粉丝 干虾仁 泡发冬菇","num":63},{"id":"2403","title":"汽水肉","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2403.jpg","collect_num":"62","food_str":"里脊肉 肥肉 生姜 葱花 盐","num":62},{"id":"77473","title":"清蒸扇贝金针菇","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/78/77473.jpg","collect_num":"62","food_str":"扇贝肉 金针菇 香葱 生姜 大蒜","num":62},{"id":"7402","title":"喳咋","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/8/7402.jpg","collect_num":"61","food_str":"黑豆 红豆 绿豆 花生 薏仁","num":61},{"id":"3214","title":"爱意靓汤","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/4/3214.jpg","collect_num":"61","food_str":"鸡骨架 排骨头 熏制火腿 生姜","num":61},{"id":"12557","title":"杏仁西芹炒虾仁","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/13/12557.jpg","collect_num":"61","food_str":"西芹 杏仁 虾仁 葱 姜","num":61},{"id":"11712","title":"韭黄炒滑蛋","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/12/11712.jpg","collect_num":"61","food_str":"鸡蛋 韭黄 红椒 盐 淀粉水","num":61},{"id":"7083","title":"酒酿南瓜豆沙圆","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/8/7083.jpg","collect_num":"60","food_str":"南瓜 糯米粉 豆沙 白糖 酒酿","num":60},{"id":"2610","title":"农家肉焖扁豆","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2610.jpg","collect_num":"60","food_str":"扁豆 猪肉 酱油 盐 蒜","num":60},{"id":"54127","title":"老虎菜","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/55/54127.jpg","collect_num":"60","food_str":"洋葱 青椒 香菜 盐 糖","num":60},{"id":"2407","title":"杭椒炒肉","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2407.jpg","collect_num":"59","food_str":"小杭椒 肉片 淀粉 调料","num":59},{"id":"49082","title":"巧克力蓝莓布丁","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/50/49082.jpg","collect_num":"59","food_str":"吉利丁片 巧克力粉 蓝莓","num":59},{"id":"2371","title":"青椒炒肉丝","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2371.jpg","collect_num":"59","food_str":"青椒 猪肉 干辣椒 花椒 姜","num":59},{"id":"73025","title":"夏日清新韭菜拌蛋丝","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/74/73025.jpg","collect_num":"58","food_str":"韭菜 盐 蛋 米醋","num":58}]
     */

    private int ret;
    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2724
         * title : 芋儿烧肉
         * pic : http://www.qubaobei.com/ios/cf/uploadfile/132/3/2724.jpg
         * collect_num : 66
         * food_str : 猪肉 芋儿 油 豆瓣 姜
         * num : 66
         */

        private String id;
        private String title;
        private String pic;
        private String collect_num;
        private String food_str;
        private int num;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getCollect_num() {
            return collect_num;
        }

        public void setCollect_num(String collect_num) {
            this.collect_num = collect_num;
        }

        public String getFood_str() {
            return food_str;
        }

        public void setFood_str(String food_str) {
            this.food_str = food_str;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
