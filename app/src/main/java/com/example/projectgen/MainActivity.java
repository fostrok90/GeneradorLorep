package com.example.projectgen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   private Button btn_Generador;
   private EditText edt_Questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Generador = findViewById(R.id.btn_Generador);
        edt_Questions = findViewById(R.id.edt_Questions);

      /*  final String questions[] = {

                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras auctor sem ac iaculis ullamcorper. Nulla quis bibendum ex, et sodales ex. Phasellus a est vel mauris semper accumsan vitae eget nulla. Donec at elit a libero sodales semper. Suspendisse libero ipsum, elementum a faucibus ut, egestas nec ante. Integer condimentum rutrum sollicitudin. Proin eget nisi sed leo congue volutpat ut vitae nulla. In vulputate dui ac lacinia hendrerit. Aenean lobortis tincidunt leo, in elementum odio iaculis nec.",
                "Curabitur ut sem vitae nisl vestibulum vestibulum ut vitae nunc. Nulla euismod venenatis enim, sed fringilla quam feugiat eget. Sed efficitur imperdiet sem sed fermentum. Morbi sit amet cursus est. Aliquam finibus lectus non ligula rhoncus, sit amet scelerisque mauris elementum. Proin aliquam purus vitae purus vehicula vestibulum. Pellentesque nunc odio, dignissim dapibus placerat at, iaculis non ipsum. Cras dignissim venenatis ipsum eget maximus. Curabitur vitae dignissim nisl, et ultrices nibh. Duis imperdiet, sapien non sodales fermentum, eros neque tempus turpis, sit amet euismod risus massa sed neque. Praesent a lectus varius dolor efficitur elementum at id massa. Cras lorem sapien, euismod venenatis blandit ac, posuere sit amet tellus.",
                "Praesent sapien dolor, egestas gravida mauris ac, scelerisque fringilla orci. Aliquam a augue urna. Aliquam erat volutpat. Duis tincidunt arcu ac neque posuere lacinia eget ut enim. Curabitur suscipit sit amet sapien vel porttitor. Aliquam erat volutpat. Cras sit amet tincidunt libero. Vivamus faucibus ante eu felis elementum dapibus. Integer nisi lorem, malesuada sit amet ultricies finibus, sollicitudin sed mi. Quisque posuere mi nunc, id gravida arcu gravida at. Mauris finibus, nunc vel malesuada pretium, ante enim tincidunt magna, nec aliquet nibh diam eget turpis.",
                "Sed eu erat blandit, congue erat sit amet, tincidunt orci. Suspendisse tempor commodo urna nec fringilla. Vestibulum justo nunc, posuere id finibus a, porttitor a ex. Etiam non diam erat. Vivamus felis nisl, tempus sed efficitur et, vestibulum eu lorem. Vivamus placerat mi nec felis feugiat mollis. Integer ac maximus sapien, gravida laoreet ligula. Mauris eget arcu tempor, porta dolor vitae, facilisis dolor. In hac habitasse platea dictumst.",
                "Vestibulum nec massa sed justo maximus convallis. Praesent nibh sem, consectetur at viverra eu, volutpat eu sapien. Mauris imperdiet ut mi nec congue. Cras vel vulputate elit. Sed scelerisque erat libero, sit amet cursus enim semper sed. Sed mollis sapien eu rutrum convallis. Nulla facilisi."

        };*/

       /*
       PRIMER INTENTO

        btn_Generador.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Random rand = new Random();
                int Questions = rand.nextInt(bound:5);

                edt_Questions.setText(questions[Questions]);
            }
        });*/


        //SEGUNDO INTENTO, getRandomString
        btn_Generador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView.setText(generateString(6));

            }
        });
        
    }

    private String generateString(int length) {
        char[] chars = ("Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit. Cras auctor sem ac iaculis ullamcorper. Nulla quis bibendum ex, et sodales ex. Phasellus a est vel mauris semper accumsan vitae eget nulla. Donec at elit a libero sodales semper. Suspendisse libero ipsum, elementum a faucibus ut, egestas nec ante." +
                " Integer condimentum rutrum sollicitudin. Proin eget nisi sed leo congue volutpat ut vitae nulla." +
                " In vulputate dui ac lacinia hendrerit. Aenean lobortis tincidunt leo, in elementum odio iaculis nec.").toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i =1; i < length; i++){
            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
