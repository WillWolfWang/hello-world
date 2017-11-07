package com.will.myhencodedemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Will on 2017/10/24/024.
 * 练习onDraw的view
 * Paint 类的几个最常用的方法。具体是：
     Paint.setStyle(Style style) 设置绘制模式
     Paint.setColor(int color) 设置颜色
     Paint.setStrokeWidth(float width) 设置线条宽度
     Paint.setTextSize(float textSize) 设置文字大小
     Paint.setAntiAlias(boolean aa) 设置抗锯齿开关
 */

public class DrawTestView extends View{
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//开启抗锯齿 或者 paint.setAntiAlias(true);
    private Path path = new Path();//初始化path对象
//    {
//        // 使用 path 对图形进行描述（这段描述代码不必看懂）心形
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//    }


    public DrawTestView(Context context) {
        super(context);
    }

    public DrawTestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private float x = 300;//圆心x轴坐标
    private float y = 300;//圆心y轴坐标
    private float correctX;//修正后的X
    private float correctY;//修正后的Y
    private int radio = 200;//半径

    private int[] args = {135, 45, 20, 10, 50, 100};//所占的比例数组

    private int startArg = -180;//开始绘制的角度

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.BLUE);//纯蓝色
//        canvas.drawColor(Color.parseColor("#88880000"));//半透明红色
        //绘制一个红色的圆
//        paint.setColor(Color.RED);
//        canvas.drawCircle(300, 300, 200, paint);//默认是一个黑色的圆
        //绘制一个空心圆
        /**
         * Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
         * FILL 是填充模式，
         * STROKE 是画线模式（即勾边模式），
         * FILL_AND_STROKE 是两种模式一并使用：既画线又填充。
         * 它的默认值是 FILL，填充模式。
         */
//        paint.setStyle(Paint.Style.STROKE);//修改为画线模式
//        paint.setStrokeWidth(20);//线条宽度为20像素
//        canvas.drawCircle(300, 300, 200, paint);

        //绘制矩形
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(100, 100, 500, 500, paint);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(100, 700, 500, 1100, paint);

        //绘制点
        /**
         * Paint.setStrokeCap(cap) 可以设置点的形状，
         * 但这个方法并不是专门用来设置点的形状的，而是一个设置线条端点形状的方法
         * ROUND 画出来是圆形的点，SQUARE 或 BUTT 画出来是方形的点。
         * 端点有圆头 (ROUND)、平头 (BUTT) 和方头 (SQUARE) 三种
         */
//        paint.setStrokeWidth(20);
//        paint.setStrokeCap(Paint.Cap.SQUARE);
//        canvas.drawPoint(50, 50, paint);

        //绘制多个点
//        paint.setStrokeWidth(20);
//        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
//        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100
//        /* 跳过两个数，即前两个 0 */
//        /* 一共绘制 8 个数（4 个点）*/
//        canvas.drawPoints(points, 2, 8, paint);

        //画椭圆
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawOval(50, 50, 350, 200, paint);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawOval(400, 50, 700, 200, paint);

        //画线
        //由于直线不是封闭图形，所以 setStyle(style) 对直线没有影响
//        canvas.drawLine(200, 200, 800, 500, paint);

        //画多条线
//        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points, paint);

        //画圆角矩形
//        canvas.drawRoundRect(100, 100, 500, 300, 50, 50, paint);

        //画弧线
        /**
         * drawArc() 是使用一个椭圆来描述弧形的。
         * left, top, right, bottom 描述的是这个弧形所在的椭圆；
         * startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度，
         * sweepAngle 是弧形划过的角度；useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，
         * 如果连接到圆心，就是扇形。
         */
//        paint.setStyle(Paint.Style.FILL);//填充模式
//        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);
//        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
//        paint.setStyle(Paint.Style.STROKE);//画线模式
//        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);
        // 绘制出 path 描述的图形（心形）
//        canvas.drawPath(path, paint);

        //通过path绘制一个圆
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//        canvas.drawPath(path, paint);

        //通过path绘制直线
        /**
         * 从当前位置向目标位置画一条直线， x 和 y 是目标位置的坐标。
         * 这两个方法的区别是，lineTo(x, y) 的参数是绝对坐标，
         * 而 rLineTo(x, y) 的参数是相对当前位置的相对坐标 （前缀 r 指的就是 relatively 「相对地」)。
         */
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);// 由当前位置 (0, 0) 向 (100, 100) 画一条直线
//        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
//        canvas.drawPath(path, paint);

        //通过path绘制二次贝塞尔曲线，没搞懂
//        paint.setStyle(Paint.Style.STROKE);
//        path.quadTo(100, 100, 300, 300);
////        path.rQuadTo(300, 300, 500, 500);
//        canvas.drawPath(path, paint);

        //可以移动到指定的位置
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);//画斜线
//        path.moveTo(200, 100);//移动
//        path.lineTo(200, 0);//画竖线
//        canvas.drawPath(path, paint);

        //path 画弧线
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(100, 100, 300, 300, -90, 90, true);// 强制移动到弧形起点（无痕迹）
//        canvas.drawPath(path, paint);

//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(100, 100, 300, 300, -90, 90, false);// 直接连线到弧形起点（有痕迹）
//        canvas.drawPath(path, paint);

        /**
         * addArc() 只是一个直接使用了 forceMoveTo = true 的简化版 arcTo() 。
         */
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.addArc(100, 100, 300, 300, -90, 90);
//        canvas.drawPath(path, paint);

        //close() 封闭当前子图形
//        paint.setStyle(Paint.Style.STROKE);
//        path.moveTo(100, 100);
//        path.lineTo(200, 100);
//        path.lineTo(150, 150);
//        path.close();
//        canvas.drawPath(path, paint);

        //绘制饼状图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        //计算偏移差
        float dx = (float) ((args[0] / 360.0) * 50);
        correctX = x - dx;
        correctY = y - dx;
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量

        path.lineTo(correctX - radio, correctY);
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg, args[0]);
        path.lineTo(correctX, correctY);
        canvas.drawPath(path, paint);

        path.reset();
        paint.setColor(Color.YELLOW);
        //计算偏移差
        dx = (float) ((args[1] / 360.0) * 50);
        correctX = x + dx;
        correctY = y - dx;
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量

        path.lineTo((float) (Math.cos(args[1]) * radio  + correctX), (float) Math.sin(args[1] * radio + correctY));
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg + args[0], args[1]);
        path.lineTo(correctX, correctY);
        canvas.drawPath(path, paint);

        path.reset();
        paint.setColor(Color.GREEN);
        //计算偏移差
        dx = (float) ((args[2] / 360.0) * 50);
        correctX = x + dx;
        correctY = y + dx;
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量
        path.lineTo((float) (Math.cos(args[2]) * radio  + correctX), (float) Math.sin(args[2] * radio + correctY));
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg + args[0] + args[1], args[2]);
        path.lineTo(correctX, correctY);
        canvas.drawPath(path, paint);

        path.reset();
        paint.setColor(Color.BLUE);
        //计算偏移差
        dx = (float) ((args[3] / 360.0) * 50);
        correctX = x + dx;
        correctY = y + dx;
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量
        path.lineTo((float) (Math.cos(args[3]) * radio  + correctX), (float) Math.sin(args[3] * radio + correctY));
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg + args[0] + args[1] + args[2], args[3]);
        path.lineTo(correctX, correctY);
        canvas.drawPath(path, paint);

        path.reset();
        paint.setColor(Color.BLACK);
        //计算偏移差
        dx = (float) ((args[4] / 360.0) * 50);
        correctX = x + dx;
        correctY = y + dx;
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量
        path.lineTo((float) (Math.cos(args[4]) * radio  + correctX), (float) Math.sin(args[4] * radio + correctY));
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg + args[0] + args[1] + args[2] + args[3], args[4]);
        path.lineTo(correctX, correctY);
        canvas.drawPath(path, paint);

        path.reset();
        paint.setColor(Color.GRAY);
        //计算偏移差
        dx = (float) ((args[5] / 360.0) * 50);
        correctX = x - dx;
        correctY = y + dx;
        Log.e("WillWolf", "correctX-->" + correctX);
        path.moveTo(correctX, correctY);//移动到圆心 + 偏移量
        path.lineTo((float) (Math.cos(args[5]) * radio  + correctX), (float) Math.sin(args[5] * radio + correctY));
        path.addArc(correctX - radio, correctY - radio, correctX + radio, correctY + radio, startArg + args[0] + args[1] + args[2] + args[3] + args[4], args[5]);
        path.lineTo(correctX, correctX);
        canvas.drawPath(path, paint);
    }
}
