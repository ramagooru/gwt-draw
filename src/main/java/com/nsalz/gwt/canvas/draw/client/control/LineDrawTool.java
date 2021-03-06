package com.nsalz.gwt.canvas.draw.client.control;

import com.nsalz.gwt.canvas.draw.client.model.DrawAppModel;

public class LineDrawTool extends BaseDrawTool
{
    private final LineTool lineTool;

    public LineDrawTool(DrawAppModel drawingModel)
    {
        super(drawingModel);
        this.lineTool = new LineTool(drawingModel);
    }

    @Override
    public void onClick(int x, int y)
    {
        super.onClick(x, y);
        if (lineTool.isLineStarted()) {
            lineTool.finishLine(x, y);
        } else {
            lineTool.startLine(x, y);
        }
    }

    @Override
    public void onCancelKey()
    {
        super.onCancelKey();
        lineTool.cancelLine();
    }

    @Override
    public void onMouseMove(int x, int y)
    {
        super.onMouseMove(x, y);
        lineTool.moveLine(x, y);
    }
}
