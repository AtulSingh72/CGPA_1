package com.example.cgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MainActivity obj = new MainActivity();


        final EditText edit = (EditText)findViewById(R.id.editText2);
        final TextView text1 = (TextView)findViewById(R.id.textView);
        final TextView text2 = (TextView)findViewById(R.id.textView3);
        final TextView text3 = (TextView)findViewById(R.id.textView2);
        final Button butt = (Button)findViewById(R.id.button);


        final int[] marks = {0};
        final String[] branch = {""};


        text1.setText("Enter your Branch");
        text2.setText("1 for C.S.E \t" +
                "2 for E.C.E.\t" +
                "3 for M.E.\t"+
                "4 for E.E\t" +
                "5 for C.E.\t");
        edit.setHint("Enter the number");
        butt.setText("Next");
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {           //When branch is selected
                branch[0] = branch[0] +edit.getText().toString();
                edit.setText("");
                text1.setText("Enter your Semester");
                text2.setText("1 for 1st sem and so on");
                edit.setHint("Enter your sem");
                butt.setText("Next");
                butt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {       //When semester is selected
                        branch[0] = branch[0] + edit.getText().toString();
                        edit.setText("");
                        text1.setText("Enter the Marks(Out of 100)");
                        edit.setHint("Marks?");
                        butt.setText("Done");
                        if(branch[0].equals("11") || branch[0].equals("21") || branch[0].equals("31") || branch[0].equals("41")|| branch[0].equals("51"))       //1st semester
                        {
                            text2.setText("Chemistry");
                            butt.setOnClickListener(new View.OnClickListener() {        //Chemistry marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Mechanics");                         //Mechanics
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Mathematics");               //Maths
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Physics");               //Physics
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Communication Skills");               //CS
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Chemistry LAB");               //chem lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(2*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Workshop");               //Workshop
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Engineering Drawing");               //ED
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(5*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=40.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("12") || branch[0].equals("22") || branch[0].equals("32") || branch[0].equals("42") || branch[0].equals("52"))          //2nd semester
                        {
                            text2.setText("IC");                                //IC
                            butt.setOnClickListener(new View.OnClickListener() {        //IC marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("BEES");                         //BEES
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Mathematics");               //Maths
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Physics");               //Physics
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("EVS");               //EVS
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("IC LAB");               //IC lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(4*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("BEES LAB");               //BEES lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Physics Lab");               //Physics lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=40.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("13"))          //CSE 3rd semester
                        {
                            text2.setText("Maths");             //Maths
                            butt.setOnClickListener(new View.OnClickListener() {        //IC marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Data Structures");                         //Data Structures
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Discrete Mathematics");               //Discrete Maths
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Digital Design");               //Digital Design
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Engineering Economics");               //EE
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Data Structures LAB");               //DS lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Digital Design LAB");               //DD lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=36.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("14"))          //CSE 4th semester
                        {
                            text2.setText("Formal Languages");             //FM
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Algorithms");                         //algorithms
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Computer Architecture");               //Computer Architecture
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Object Oriented Programming");               //oops
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Probability and Random Process");               //probability
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Algorithms LAB");               //Algo lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Object Oriented Programming LAB");               //oops lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Peripherals and Accessories LAB");        //peripheral lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=41.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("15"))          //CSE 5th semester
                        {
                            text2.setText("Optimization");             //optimization
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Software Engineering");                         //software engineering
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Operating System");               //os
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Data Communication");               //data communication
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Machine Learning");               //machine learning
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Software Engineering LAB");               //soft lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Operating Systems LAB");               //os lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Machine Learning LAB");        //ml lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=41.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("16"))          //CSE 6th semester
                        {
                            text2.setText("Management and Economics");             //management
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Databases");                         //databases
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Compilers");               //compilers
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Computer Networks");               //comp. net.
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Information Storage and Retrieval");               //info
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Databases LAB");               //data lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("System Programming LAB");               //compilers lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Computer Networks LAB");        //cn lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=39.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("17"))          //CSE 7th semester
                        {
                            text2.setText("Computer Graphics");             //graphics
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Numerical Methods");                         //numerical
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Department Elective - I");               //de1
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Department Elective - II");               //de2
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Department Elective - III");               //de3
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Computer Graphics LAB");               //graphics lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Project - I");               //project1
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(6*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=39.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("18"))          //CSE 8th semester
                        {
                            text2.setText("Department Elective - IV");             //de4
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Department Elective - V");                         //de5
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Department Elective - VI");               //de6
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Project - II");               //project2
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            double total = marks[0];
                                                            total/=27.0;
                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                            startActivity(intent);
                                                            finish();
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("23"))          //ECE 3rd semester
                        {
                            text2.setText("Network Analysis");             //na
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Semiconductor Device and Circuits");                         //sdc
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Analog Circuits");               //AC
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Maths");               //math
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("HSS Elective");               //hss
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Network Analysis LAB");               //na lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Semiconductor Device LAB");               //sdc lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Analog Circuits LAB");        //ac lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=37.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("24"))          //ECE 4th semester
                        {
                            text2.setText("Digital Electronics");             //de
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Analog Communication");                         //ac
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Electronics and Electrical Measurements");               //ee
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Signals and System");               //signals
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Probability and Random Process");               //prob
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Digital Electronics LAB");               //de lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Analog Communication LAB");               //ac lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Electronics and Electrical Measurement LAB");        //ee lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=39.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("25"))          //ECE 5th semester
                        {
                            text2.setText("Microprocessors");             //micro
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Digital Communication");                         //dc
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Electromagnetic  Thoery");               //em
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Digital Signal Processing");               //digital signals
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Control System");               //cs
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Microprocessors LAB");               //micro lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Digital Communication LAB");               //dc lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Digital Signal Processing LAB");        //digital signals lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            edit.setText("");
                                                                                            text2.setText("Control Systems LAB");           //cs LAB
                                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {
                                                                                                    marks[0]+=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                                    double total = marks[0];
                                                                                                    total/=42.0;
                                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                                    startActivity(intent);
                                                                                                    finish();
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("26"))          //ECE 6th semester
                        {
                            text2.setText("VLSI Design");             //vlsi
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Embedded System");                         //embedded systems
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Industrial Electronics");               //industrial
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Antenna Design");               //antenna
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("VHDL");               //vhdl
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("VLSI and VHDL LAB");               //VLSI lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Embedded System LAB");               //embedded lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Industrial Electronics LAB");        //industrial signals lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            edit.setText("");
                                                                                            text2.setText("Antenna Design LAB");           //antenna LAB
                                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {
                                                                                                    marks[0]+=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                                    double total = marks[0];
                                                                                                    total/=42.0;
                                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                                    startActivity(intent);
                                                                                                    finish();
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("27"))          //ECE 7th semester
                        {
                            text2.setText("Industrial Management");             //industrial
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Microwave Engineering");                         //me
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Computer Networks");               //computer
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Department Elective - I");               //de1
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Department Elective - II");               //de2
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Project - I");               //project1
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Microwave Engineering LAB");               //mw lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Computer Networks LAB");        //networks lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=37.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("28"))          //ECE 8th semester
                        {
                            text2.setText("Department Elective - III");             //de3
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Department Elective - IV");                         //de4
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Open Elective");               //oe
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Soft Skills");               //soft skills
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Project Work - II");     //project
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(9*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    double total = marks[0];
                                                                    total/=31.0;
                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("33"))          //ME 3rd semester
                        {
                            text2.setText("Mathematics");             //maths
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Engineering Thermodynamics");                         //thermo
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Strength of Materials");               //strength
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Engineering Materials");               //eng. materials
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Manufacturing Technology");               //manufacturing
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Machine Drawing");               //machine drawing
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(5*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Strength of Materials LAB");               //stength lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=40.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("34"))          //ME 4th semester
                        {
                            text2.setText("Numerical Methods");             //numerical methods
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Fluid Mechanics");                         //fluid
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Kinematics of Machinery");               //kinematics
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Heat and Mass Transfer");               //heat
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Manufacturing Technology - II");               //manufacturing
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Heat Transfer LAB");               //heat transfer
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Manufacturing Technology LAB");               //manufacturing technology lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=40.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("35"))          //ME 5th semester
                        {
                            text2.setText("Mechanical Measurements and Metrology");             //measurements
                            butt.setOnClickListener(new View.OnClickListener() {        //IC marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Trubomachines");                         //turbo
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Dynamics of Machinery");               //machinery
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Thermal Engineering - I");               //Thermal Eng1
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Design of Machine Elements - I");               //machine elements
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Measurements and Metrology LAB");               //Measurements lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Fluid Mechanics and Turbomachinery LAB");               //fluid lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Dynamics of Machine LAB");       //dynamics LAB
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=41.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("36"))          //ME 6th semester
                        {
                            text2.setText("Mechatronics");             //mechatronics
                            butt.setOnClickListener(new View.OnClickListener() {        //IC marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Automobile Engineering");                         //automobile
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Refrigeration");               //refrigeration
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Thermal Engineering - II");               //Thermal Eng2
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Design of Machine Elements - II");               //machine elements2
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Mechatronics LAB");               //Mechatronics lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Automobile Engineering LAB");               //automobile lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Thermal Engineering LAB");       //thermal LAB
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=41.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("37"))          //ME 7th semester
                        {
                            text2.setText("HSS Elective");             //hss
                            butt.setOnClickListener(new View.OnClickListener() {        //IC marks entered
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Industrial Engineering and Operations Reaserch");                         //insudtrial
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("CAD/CAM");               //cad
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Departmental Elective - I");               //de1
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Departmental Elective - II");               //de2
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("CAD/CAM LAB");               //cad lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Project Work - I");               //project1
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=34.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("38"))          //ME 8th semester
                        {
                            text2.setText("HSS Elective");             //hss
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Department Elective - III");                         //de3
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Department Elective - IV");               //de4
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Open Elective");               //oe
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Project Work - II");     //project
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(9*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    double total = marks[0];
                                                                    total/=31.0;
                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("43"))          //EE 3rd semester
                        {
                            text2.setText("Network Analysis");             //na
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Semiconductor Device and Circuits");                         //sdc
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Analog Circuits");               //AC
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Maths");               //math
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("HSS Elective");               //hss
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Network Analysis LAB");               //na lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Semiconductor Device LAB");               //sdc lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Analog Circuits LAB");        //ac lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=37.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("44"))          //EE 4th semester
                        {
                            text2.setText("Numerical Methods");             //numerical
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Digital Electronics");                         //ac
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Measurements and Instrumentation");               //ee
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Signals and System");               //signals
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Electrical Machines - I");               //machines
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Digital Electronics LAB");               //de lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Electrical Machines LAB");               //machines lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Measurement and Instrumentation LAB");        //instrumentation lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=41.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("45"))          //EE 5th semester
                        {
                            text2.setText("Power Electronics");             //power
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Electrical Machines - II");                         //machines
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Transmission and Distribution");               //transmission
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Control System");               //systems
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Electromagnetic Field");               //electromagnetic feild
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Electrical Machines - II LAB");               //machines lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Power Electronics LAB");               //power lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Numerical Methods LAB");        //numericals lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=39.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("46"))          //EE 6th semester
                        {
                            text2.setText("Microprocessors and Applications");             //microprocessors
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Power System Protection");                         //power system
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Advanced Control System");               //advanced control
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Renewable Energy Resources");               //Resources
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Communication System");               //communication
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Microprocessor LAB");               //microprocessors lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Power System LAB");               //power lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Control System LAB");        //control lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=39.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("47"))          //EE 7th semester
                        {
                            text2.setText("High Voltage Engineering");             //voltage
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Power System Analysis");                         //power system
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Elective - I");               //elective1
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Elective - II");               //elective2
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Renewable Energy LAB");               //renewable lab
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Project - I");               //project
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (6 * obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            double total = marks[0];
                                                                            total /= 39.0;
                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("48"))          //EE 8th semester
                        {
                            text2.setText("Power System Operation and Control");             //power
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Elective - III");                         //elective3
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Open Elective");               //op
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("HSS Elective - IV");               //hss4
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Project - II");               //project2
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(8*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    double total = marks[0];
                                                                    total /= 39.0;
                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                    startActivity(intent);
                                                                    finish();
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("53"))          //CE 3rd semester
                        {
                            text2.setText("Mathematics");             //maths
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Solid Mechanics");                         //sm
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Engineering Geology");               //geology
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Civil Engineering Materials");               //materials
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Surveying");               //survey
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Civil Engineering Materials LAB");               //Civil Engineering Materials lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Surveying LAB");               //Surveying lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    edit.setText("");
                                                                                    text2.setText("Building Drawing and CAD LAB");        //Building Drawing and CAD lab
                                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                                        @Override
                                                                                        public void onClick(View v) {
                                                                                            marks[0] +=(4*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                            double total = marks[0];
                                                                                            total/=42.0;
                                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                            startActivity(intent);
                                                                                            finish();
                                                                                        }
                                                                                    });

                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("54"))          //CE 4th semester
                        {
                            text2.setText("Numerical Methods");             //numerical
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Structural Analysis - I");                         //Structural Analysis I
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Environmental Engineering - I");               //Environmental Engineering I
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Geotechnical Engineering - I");               //Geotechnical Engineering I
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Hydrology and Water Resources Engineering");               //Hydrology and Water Resources Engineering
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Environmental Engineering LAB");               //Environmental Engineering lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Geotechnical Engineering - I LAB");               //Geotechnical Engineering lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=38.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("55"))          //CE 5th semester
                        {
                            text2.setText("Structural Analysis II");             //power
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Environmental Engineering II");                         //machines
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Geotechnical Engineering II");               //transmission
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Fluid Mechanics");               //systems
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Reinforced Concrete Design");               //electromagnetic feild
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Geotechnical Engineering - II LAB");               //machines lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Fluid Mechanics LAB");               //power lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=39.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("56"))          //CE 6th semester
                        {
                            text2.setText("HSS - II");             //microprocessors
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Transportation Engineering - I");                         //power system
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Construction Technology and Management");               //advanced control
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Design of Steel Structures");               //Resources
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(8*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Hydraulics and Hydraulic Structures");               //communication
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Transportation Engineering - I LAB");               //microprocessors lab
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            edit.setText("");
                                                                            text2.setText("Hydraulics and Hydraulic Structures LAB");               //power lab
                                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {
                                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                                    double total = marks[0];
                                                                                    total/=39.0;
                                                                                    Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                                    intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("57"))          //CE 7th semester
                        {
                            text2.setText("HSS - III");             //voltage
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(4*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Transportation Engineering - II");                         //power system
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Elective - I");               //elective1
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Elective - II");               //elective2
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            edit.setText("");
                                                            text2.setText("Open Elective - I");               //renewable lab
                                                            butt.setOnClickListener(new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    marks[0] +=(3*obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                    edit.setText("");
                                                                    text2.setText("Computational LAB");               //project
                                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            marks[0] += (3 * obj.pract(Integer.valueOf(String.valueOf(edit.getText()))));
                                                                            double total = marks[0];
                                                                            total /= 31.0;
                                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                                            startActivity(intent);
                                                                            finish();
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if(branch[0].equals("58"))          //CE 8th semester
                        {
                            text2.setText("Departmental Elective - III");             //power
                            butt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                    edit.setText("");
                                    text2.setText("Departmental Elective IV");                         //elective3
                                    butt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                            edit.setText("");
                                            text2.setText("Open Elective - II");               //op
                                            butt.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    marks[0] +=(6*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                    edit.setText("");
                                                    text2.setText("Project");               //hss4
                                                    butt.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            marks[0] +=(9*obj.theo(Integer.valueOf(String.valueOf(edit.getText()))));
                                                            double total = marks[0];
                                                            total /= 27.0;
                                                            Intent intent = new Intent(MainActivity.this, Marks.class);
                                                            intent.putExtra("Marks", Math.round(total * 100.0) / 100.0);
                                                            startActivity(intent);
                                                            finish();
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }

                    }
                });

            }
        });
    }
    public int theo(int n)
    {
        if(n>=90 && n<=100)
            return 10;
        else if(n<=89 && n>=80)
            return 9;
        else if(n<=79 && n>=70)
            return 8;
        else if(n<=69 && n>=60)
            return 7;
        else if(n<=59 && n>=50)
            return 6;
        else if(n<=49 && n>=40)
            return 5;
        else
            return 0;
    }
    public int pract(int n)
    {
        if(n>=90 && n<=100)
            return 10;
        else if(n<=89 && n>=80)
            return 9;
        else if(n<=79 && n>=70)
            return 8;
        else if(n<=69 && n>=60)
            return 7;
        else if(n<=59 && n>=50)
            return 6;
        else
            return 0;
    }
}
