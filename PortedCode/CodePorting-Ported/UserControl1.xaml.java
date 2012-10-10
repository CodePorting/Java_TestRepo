package WpfApplication2;

// ********* THIS FILE IS AUTO PORTED FROM C# USING CODEPORTING.COM *********

import com.codeporting.csharp2java.java.Enum;


/*enum*/ final class ProgressType extends Enum
{
	private ProgressType(){}	
    public static final int AUDIO_CD_CONTROL = 0;
    public static final int VIDEO_CD_CONTROL = 1;
    public static final int DATA_CD_CONTROL = 2;
    public static final int AUDIO_DVD_CONTROL = 3;
    public static final int VIDEO_DVD_CONTROL = 4;
    public static final int DATA_DVD_CONTROL = 5;

	static {
		Enum.register(new Enum.SimpleEnum(ProgressType.class, Integer.class) {{
		addConstant("AUDIO_CD_CONTROL", AUDIO_CD_CONTROL);
		addConstant("VIDEO_CD_CONTROL", VIDEO_CD_CONTROL);
		addConstant("DATA_CD_CONTROL", DATA_CD_CONTROL);
		addConstant("AUDIO_DVD_CONTROL", AUDIO_DVD_CONTROL);
		addConstant("VIDEO_DVD_CONTROL", VIDEO_DVD_CONTROL);
		addConstant("DATA_DVD_CONTROL", DATA_DVD_CONTROL);
		}});
	}


}
/**
     * <p>
     * Interaction logic for UserControl1.xaml
     * </p>
     */
public partial class UserControl1 extends UserControl
{
    private double stepSize;
    private /*ProgressType*/int cType;
    
    public UserControl1()
    {
        InitializeComponent();
    }

    public double getUserControlProgressLimit() { return this.rectTotal.Width; }
    public void setUserControlProgressLimit(double value) { 
            this.rectTotal.Width = value;
            this.stepSize = (int)this.rectTotal.Width / 100;
        }

    public double getUserControlProgressValue() { return this.rectProgress.Width; }
    public void setUserControlProgressValue(double value) {
            double val = 100.0 / 280.0;
            this.rectProgress.Width = val*value+25.0;
            this.displayString();
        }

    public double getUserControlStepSize() { return this.stepSize; }
    public void setUserControlStepSize(double value) { this.stepSize = value; }

    public void incrementProgress(int steps)
    {
        if (steps == 0)
            this.rectProgress.Width += stepSize;
        else
            this.rectProgress.Width += (steps * stepSize);
    }


    public void setControlType(int iType)
    {
        cType = (/*ProgressType*/int)iType;
        this.displayString();
    }
    

    private void displayString()
    {
        switch (cType)
        {
            case ProgressType.AUDIO_CD_CONTROL:
                //TextValue.Text = "0min                20min                 40min                 80min                 100min                 120min";
                //TextValue.Text = " 0min     10min     20min     30min    40min    50min    60min    70min   80min   90min   100min   110min    120min";
                TextValue.Text = " 0min    10min    20min     30min    40min    50min    60min    70min  80min  90min 100min 110min 120min";
                break;
            case ProgressType.VIDEO_CD_CONTROL:
            case ProgressType.DATA_CD_CONTROL:
                //TextValue.Text = "0 Mb        100 Mb       200 Mb      300 Mb      400 Mb      500 Mb      600 Mb      700 Mb";
                TextValue.Text = " 0Mb   100Mb    200Mb    300Mb   400Mb   500Mb   600Mb   700Mb";
                break;
            case ProgressType.AUDIO_DVD_CONTROL:
            case ProgressType.VIDEO_DVD_CONTROL:
            case ProgressType.DATA_DVD_CONTROL:
                TextValue.Text = "0 Gb       1 Gb        2Gb        3 Gb       4 Gb       5 Gb       6 Gb      7 Gb     8 Gb";
                break;
           
        }
        //if (this.rectTotal.Width <= 300)
        //{
        //    //TextValue.Text = "0 Mb        100 Mb       200 Mb      300 Mb      400 Mb      500 Mb      600 Mb      700 Mb";
        //}
        //else
        //{
        //    //TextValue.Text = "0 Gb          1 Gb            2Gb           3 Gb           4 Gb           5 Gb          6 Gb           7 Gb          8 Gb";
        //}
    }

    private void textValue_TextChanged(Object sender, TextChangedEventArgs e)
    {

    }

    private void userControlProgress_Loaded(Object sender, RoutedEventArgs e)
    {

    }
}

