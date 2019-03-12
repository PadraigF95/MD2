package ie.wit.tourism.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ie.wit.tourism.R;

import static java.lang.Integer.parseInt;

public class Currency_Converter extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency__converter);
    }

    void convertUsdToEuro()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  euro=(EditText) findViewById(R.id.euro);
        euro.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a/1.12;
        euro.setText(String.valueOf(result));

    }

    void convertEuroToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  euro=(EditText) findViewById(R.id.euro);
        euro.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(euro.getText().toString());
        double result=a*1.12;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToEuro();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  euro=(EditText) findViewById(R.id.euro);
        usd.setText("");
        euro.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertEuroToUsd();
    }

}
