package WpfApplication2;

// ********* THIS FILE IS AUTO PORTED FROM C# USING CODEPORTING.COM *********

import java.lang.Thread;


//enum ProgressType
//{
//    audioCDControl = 0,
//    videoCDControl = 1,
//    dataCDControl = 2,
//    audioDVDControl = 3,
//    videoDVDControl = 4,
//    dataDVDControl = 5
//};

/**
     * <p>
     * Interaction logic for Window1.xaml
     * </p>
     */
public partial class Window1 extends Window
{
    public static UserControl1 userControlP;
    public static void staticMethod()
    {
        for (int i = 0; i < 30; i++)
        {
            userControlP.setUserControlProgressValue(i * 20);
            Thread.sleep(500);
        }
    }

    public Window1()
    {
        InitializeComponent();

        // for DVD 8 GB
        userControlProgress.UserControlProgressLimit = 450;
        userControlProgress.UserControlProgressValue = 15;
    }

    private void button_Click(Object sender, RoutedEventArgs e)
    {
        userControlProgress.setControlType(2);
    }

    private void button_Click_1(Object sender, RoutedEventArgs e)
    {
        userControlProgress.setControlType(0);
        //Timer timer = new Timer(new TimerCallback(CheckStatus), null, 0, 2000);           

        //userControlP = userControlProgress;
        //Thread progThread = new Thread(new ThreadStart(StaticMethod));

        //// Start the thread.
        //progThread.Start();
    }

    private void checkStatus(Object state)
    {
        userControlProgress.UserControlProgressValue = 200;
    }

    private void button_Click_2(Object sender, RoutedEventArgs e)
    {
        userControlProgress.setControlType(5);
    }

    private void button_Click_3(Object sender, RoutedEventArgs e)
    {
        userControlProgress.setControlType(1);
    }

    private void button_Click_4(Object sender, RoutedEventArgs e)
    {
        userControlProgress.setControlType(2);
    }

    private void button_Click_5(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 0;
    }

    private void button_Click_6(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 100;
    }

    private void button_Click_7(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 200;
    }

    private void button_Click_8(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 300;
    }

    private void button_Click_9(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 400;
    }

    private void button_Click_10(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 500;
    }

    private void button_Click_11(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 600;
    }

    private void button_Click_12(Object sender, RoutedEventArgs e)
    {
        userControlProgress.UserControlProgressValue = 700;
    }
}

