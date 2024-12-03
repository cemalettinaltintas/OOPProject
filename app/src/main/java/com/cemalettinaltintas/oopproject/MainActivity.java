package com.cemalettinaltintas.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //encapsulation
        User myUser=new User("Cemalettin","Teacher");
        User newUser=new User("Adil","Student");
        System.out.println(newUser.getName());

        newUser.setName("Ali","123");
        System.out.println(newUser.getName());

        //inheritance
        BaseMusician baseMusician=new BaseMusician("Ali","Gitar",15);
        baseMusician.setAge(20);
        System.out.println(baseMusician.getAge());

        Musician musician=new Musician("Ahmet","Piyano",25);

        System.out.println(musician.getName());
        System.out.println(musician.sing());

        Piyanist piyanist=new Piyanist("Enes","Piyano",17);
        System.out.println(piyanist.play());

        //polymorphism

        //Static polymorphism

        Mathematics mathematics=new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(2,3));
        System.out.println(mathematics.sum(2,3,5));

        //Dynamic polymorphism

        Animal animal=new Animal();
        animal.sound();
        Dog dog=new Dog();
        dog.sound();
        Cat cat=new Cat();
        cat.sound();
    }
}