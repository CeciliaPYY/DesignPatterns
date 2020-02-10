package com.company.facade;

import javax.swing.*;
import java.awt.*;

public class PlotPanel extends JPanel {

    private int nPoints;
    private int[] xPoints;
    private int[] yPoints;

    private Function xFunction;
    private Function yFunction;


    PlotPanel(Function x, Function y, int n) {
        this.xFunction = x;
        this.yFunction = y;

        this.nPoints = n;
        this.xPoints = new int[this.nPoints];
        this.yPoints = new int[this.nPoints];

        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        double w = getWidth() - 1;
        double h = getHeight() - 1;

        for (int i = 0; i < this.nPoints; i++) {
            double t = ((double) i) / (this.nPoints - 1);
            this.xPoints[i] = (int) (xFunction.f(t) * w);
            this.yPoints[i] = (int) (h * (1 - yFunction.f(t)));
        }

        g.drawPolyline(this.xPoints, this.yPoints, this.nPoints);
    }
}
