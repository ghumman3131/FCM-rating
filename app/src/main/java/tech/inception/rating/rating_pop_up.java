package tech.inception.rating;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by ghumman on 5/20/2017.
 */

public class rating_pop_up extends Dialog {

    RatingBar ratingbar1;
    Button button;

    Context c ;
    public rating_pop_up(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);

        c = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_pop_layout);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        ratingbar1=(RatingBar)findViewById(R.id.ratingBar1);
        button=(Button)findViewById(R.id.button1);
        //Performing action on Button Click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting the rating and displaying it on the toast
                String rating=String.valueOf(ratingbar1.getRating());
                Toast.makeText(c, rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
