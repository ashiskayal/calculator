package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class some {

//    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, dot, multi, AC, delete,
//            divide, plus, subtract, equal;
//
//    private TextView result, history;
//
//    String number = null;
//    String hist, currentResult;
//
//    double firstNumber = 0;
//    double lastNumber = 0;
//
//    String status = null;
//    boolean operator = false;
//    boolean noDot = true;
//    boolean btnACcontrol = true;
//    boolean btnEqualControl = false;
//    DecimalFormat decimalFormat = new DecimalFormat("######.######");
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        initializeComponents();
//
//        button0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("0");
//            }
//        });
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("1");
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("2");
//            }
//        });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("3");
//            }
//        });
//
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("4");
//            }
//        });
//
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("5");
//            }
//        });
//
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("6");
//            }
//        });
//
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("7");
//            }
//        });
//
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("8");
//            }
//        });
//
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                numberClick("9");
//            }
//        });
//
//        AC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText("0");
//                number = null;
//                status = null;
//                firstNumber = 0;
//                lastNumber = 0;
//                hist = "";
//                history.setText("");
//                noDot = true;
//                btnACcontrol = true;
//            }
//        });
//
//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (btnACcontrol) {
//                    result.setText("0");
//                } else {
//                    number = number.substring(0,number.length()-1);
//                    if (number.length()<=0) {
//                        delete.setClickable(false);
//                    }
//                    else if(number.contains(".")) {
//                        noDot = false;
//                    } else {
//                        noDot = true;
//                    }
//                    result.setText(number);
//                }
//
//            }
//        });
//
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hist = history.getText().toString();
//                currentResult = result.getText().toString();
//                history.setText(hist+currentResult+"+");
//
//                if(operator) {
//                    if (status=="multiplication") {
//                        multiplication();
//                    } else if(status=="division") {
//                        divide();
//                    } else if(status=="subtraction") {
//                        minus();
//                    } else {
//                        plus();
//                    }
//                }
////                callHist("+");
//                status = "sum";
//                operator = false;
//                number = null;
//                noDot = true;
//            }
//        });
//
//        subtract.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hist = history.getText().toString();
//                currentResult = result.getText().toString();
//                history.setText(hist+currentResult+"-");
//                if(operator) {
//                    if (status=="multiplication") {
//                        multiplication();
//                    } else if(status=="division") {
//                        divide();
//                    } else if(status=="sum") {
//                        plus();
//                    } else {
//                        minus();
//                    }
//                }
////                callHist("-");
//                status = "subtraction";
//                operator = false;
//                number = null;
//                noDot = true;
//            }
//        });
//
//        divide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hist = history.getText().toString();
//                currentResult = result.getText().toString();
//                history.setText(hist+currentResult+"/");
//                if(operator) {
//                    if (status=="sum") {
//                        plus();
//                    } else if(status=="multiplication") {
//                        divide();
//                    } else if(status=="subtraction") {
//                        minus();
//                    } else {
//                        divide();
//                    }
//                }
////                callHist("/");
//                status = "division";
//                operator = false;
//                number = null;
//                noDot = true;
//            }
//        });
//
//        multi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hist = history.getText().toString();
//                currentResult = result.getText().toString();
//                history.setText(hist+currentResult+"-*");
//                if(operator) {
//                    if (status=="sum") {
//                        plus();
//                    } else if(status=="division") {
//                        divide();
//                    } else if(status=="subtraction") {
//                        minus();
//                    } else {
//                        multiplication();
//                    }
//                }
////                callHist("*");
//                status = "multiplication";
//                operator = false;
//                number = null;
//                noDot = true;
//            }
//        });
//
//        equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                try {
////                    lastNumber = Integer.parseInt(result.getText().toString());
////                    firstNumber += lastNumber;
////                } catch (NumberFormatException e) {
////                    hist = result.getText().toString();
////                    history.setText(hist);
////                }
////                result.setText(""+firstNumber);
//
//                if(operator) {
//                    if (status=="sum") {
//                        plus();
//                    } else if(status=="division") {
//                        divide();
//                    } else if(status=="subtraction") {
//                        minus();
//                    } else if(status=="multiplication") {
//                        multiplication();
//                    } else {
//                        firstNumber = Double.parseDouble(result.getText().toString());
//                    }
//                }
//                operator = false;
////                number = null;
//                btnEqualControl = true;
//
//            }
//        });
//
//        dot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if(noDot) {
//                    if(number==null) {
//                        number = "0.";
//                    } else {
//                        number = number + ".";
//                    }
//                }
//                result.setText(number);
//                noDot = false;
//            }
//        });
//
//    }
//
//
//    private void plus() {
//        lastNumber = Double.parseDouble(result.getText().toString());
//        firstNumber += lastNumber;
//        result.setText(decimalFormat.format(firstNumber));
//    }
//
//    private void minus() {
//        if(firstNumber==0) {
//            firstNumber = Double.parseDouble(result.getText().toString());
//        } else {
//            lastNumber = Double.parseDouble(result.getText().toString());
//            firstNumber -= lastNumber;
//        }
//        result.setText(decimalFormat.format(firstNumber));
//    }
//
//    private void divide() {
//        if(firstNumber==0) {
//            lastNumber = Double.parseDouble(result.getText().toString());
//            firstNumber = lastNumber/1;
//        } else {
//            lastNumber = Double.parseDouble(result.getText().toString());
//            firstNumber /= lastNumber;
//        }
//        result.setText(decimalFormat.format(firstNumber));
//    }
//
//    private void multiplication() {
//        if(firstNumber==0) {
//            firstNumber = 1;
//        }
//        lastNumber = Double.parseDouble(result.getText().toString());
//        firstNumber *= lastNumber;
//        result.setText(decimalFormat.format(firstNumber));
//    }
//
//    private void callHist(String hist) {
//        this.hist += hist;
//        history.setText(this.hist);
//    }
//
//
//    private void numberClick(String view) {
//        if(number==null) {
//            number = view;
//        }
//        else if(btnEqualControl) {
//            firstNumber = 0;
//            lastNumber = 0;
//            number = view;
//        }
//        else {
//            number += view;
//        }
////        hist += view;
////        history.setText(this.hist);
//        result.setText(number);
//        operator = true;
//        btnACcontrol = false;
//        delete.setClickable(true);
//        btnEqualControl = false;
//    }
//
//    private void initializeComponents() {
//        button0 = findViewById(R.id.button0);
//        button9 = findViewById(R.id.button9);
//        button8 = findViewById(R.id.button8);
//        button7 = findViewById(R.id.button7);
//        button6 = findViewById(R.id.button6);
//        button5 = findViewById(R.id.button5);
//        button4 = findViewById(R.id.button4);
//        button3 = findViewById(R.id.button3);
//        button2 = findViewById(R.id.button2);
//        button1 = findViewById(R.id.button1);
//        AC = findViewById(R.id.buttonAC);
//        dot = findViewById(R.id.buttonDot);
//        multi = findViewById(R.id.buttonMulti);
//        delete = findViewById(R.id.buttonDelete);
//        divide = findViewById(R.id.buttonDivide);
//        plus = findViewById(R.id.buttonPlus);
//        subtract = findViewById(R.id.buttonMinus);
//        equal = findViewById(R.id.buttonEqual);
//
//        history = findViewById(R.id.textViewHistory);
//        result = findViewById(R.id.textViewResult);
//    }

    /*************

     private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, dot, multi, AC, delete,
     divide, plus, subtract, equal;

     private TextView result, history;

     String enteredNumber = "";
     String histValue = "";

     private double firstNumber = 0;
     private double lastNumber = 0;

     private boolean plusOn = false;
     private boolean minusOn = false;
     private boolean divideOn = false;
     private boolean multiOn = false;

     private boolean isEqualOn = false;
     private boolean isEqualPressed = false;

     boolean noDot = true;

     DecimalFormat decimalFormat = new DecimalFormat("###########.######");


     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

     initializeComponents();

     button0.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("0");
     }
     });

     button1.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("1");
     }
     });

     button2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("2");
     }
     });

     button3.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("3");
     }
     });

     button4.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("4");
     }
     });

     button5.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("5");
     }
     });

     button6.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("6");
     }
     });

     button7.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("7");
     }
     });

     button8.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("8");
     }
     });

     button9.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualPressed) { ac(); }
     numberClick("9");
     }
     });

     AC.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     ac();
     }
     });

     delete.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     String text = result.getText().toString();
     String histText = history.getText().toString();
     if(text.length()>0){
     result.setText(text.substring(0, text.length()-1));
     history.setText(histText.substring(0, histText.length()-1));
     histValue = history.getText().toString();
     enteredNumber = result.getText().toString();
     } else {
     delete.setClickable(false);
     }
     }
     });

     plus.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     histValue += "+";
     history.setText(histValue);
     isEqualOn = false;
     plus();
     }
     });

     subtract.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     histValue += "-";
     history.setText(histValue);
     isEqualOn = false;
     minus();
     }
     });

     divide.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     histValue += "/";
     history.setText(histValue);
     isEqualOn = false;
     divide();
     }
     });

     multi.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     histValue += "*";
     history.setText(histValue);
     isEqualOn = false;
     multiplication();
     }
     });

     equal.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     if(isEqualOn)
     equal();
     else
     Toast.makeText(getApplicationContext(), "Please enter a number!!", Toast.LENGTH_LONG).show();
     }
     });

     dot.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
     isEqualOn = false;
     if(noDot) {
     if(enteredNumber==null) {
     enteredNumber = "0.";
     histValue = "0.";
     } else {
     enteredNumber += ".";
     histValue += ".";
     }
     }
     result.setText(enteredNumber);
     history.setText(histValue);
     noDot = false;
     }
     });

     }

     private void ac() {
     result.setText("0");
     histValue = "";
     history.setText(histValue);
     enteredNumber = "";
     firstNumber = 0;
     lastNumber = 0;
     isEqualPressed = false;
     isEqualOn = false;
     noDot = true;
     }


     private void equal() {
     lastNumber = Double.parseDouble(result.getText().toString());

     if(minusOn) {
     firstNumber -= lastNumber;
     } else if (divideOn) {
     firstNumber /= lastNumber;
     } else if (multiOn) {
     firstNumber *= lastNumber;
     } else if(plusOn) {
     firstNumber += lastNumber;
     }

     result.setText(decimalFormat.format(firstNumber));
     enteredNumber = "";
     minusOn = false;
     plusOn = false;
     divideOn = false;
     multiOn = false;
     isEqualOn = false;
     isEqualPressed = true;
     lastNumber = 0;
     noDot = true;
     }

     private void plus() {
     if(!isEqualPressed) {
     lastNumber = Double.parseDouble(result.getText().toString());
     }
     if(minusOn) {
     firstNumber -= lastNumber;
     } else if (divideOn) {
     firstNumber /= lastNumber;
     } else if (multiOn) {
     firstNumber *= lastNumber;
     } else {
     firstNumber += lastNumber;
     }

     result.setText("0");
     enteredNumber = "";
     minusOn = false;
     plusOn = true;
     divideOn = false;
     multiOn = false;
     lastNumber = 0;
     noDot = true;
     }

     private void minus() {
     if(!isEqualPressed) {
     lastNumber = Double.parseDouble(result.getText().toString());
     }
     if(plusOn) {
     firstNumber += lastNumber;
     } else if (divideOn) {
     firstNumber /= lastNumber;
     } else if (multiOn) {
     firstNumber *= lastNumber;
     } else {
     firstNumber += lastNumber;
     }

     result.setText("0");
     enteredNumber = "";
     minusOn = true;
     plusOn = false;
     divideOn = false;
     multiOn = false;
     lastNumber = 0;
     noDot = true;
     }

     private void divide() {
     if(!isEqualPressed) {
     lastNumber = Double.parseDouble(result.getText().toString());
     }
     if(plusOn) {
     firstNumber += lastNumber;
     } else if (minusOn) {
     firstNumber -= lastNumber;
     } else if (multiOn) {
     firstNumber *= lastNumber;
     } else {
     firstNumber += lastNumber;
     }

     result.setText("0");
     enteredNumber = "";
     minusOn = false;
     plusOn = false;
     divideOn = true;
     multiOn = false;
     lastNumber = 0;
     noDot = true;
     }

     private void multiplication() {
     if(!isEqualPressed) {
     lastNumber = Double.parseDouble(result.getText().toString());
     }
     if(plusOn) {
     firstNumber += lastNumber;
     } else if (divideOn) {
     firstNumber /= lastNumber;
     } else if (minusOn) {
     firstNumber -= lastNumber;
     } else {
     firstNumber += lastNumber;
     }
     result.setText("0");
     enteredNumber = "";
     minusOn = false;
     plusOn = false;
     divideOn = false;
     multiOn = true;
     lastNumber = 0;
     noDot = true;
     }


     private void callHist(String hist) {
     }


     private void btnMethod() {


     }

     private void numberClick(String view) {
     if(result.getText().toString().length()>0) delete.setClickable(true);
     double tempEntered = 0;
     isEqualOn = true;
     enteredNumber += view;
     tempEntered = Double.parseDouble(enteredNumber);
     result.setText(decimalFormat.format(tempEntered));
     histValue += view;
     history.setText(histValue);

     }

     private void initializeComponents() {
     button0 = findViewById(R.id.button0);
     button9 = findViewById(R.id.button9);
     button8 = findViewById(R.id.button8);
     button7 = findViewById(R.id.button7);
     button6 = findViewById(R.id.button6);
     button5 = findViewById(R.id.button5);
     button4 = findViewById(R.id.button4);
     button3 = findViewById(R.id.button3);
     button2 = findViewById(R.id.button2);
     button1 = findViewById(R.id.button1);
     AC = findViewById(R.id.buttonAC);
     dot = findViewById(R.id.buttonDot);
     multi = findViewById(R.id.buttonMulti);
     delete = findViewById(R.id.buttonDelete);
     divide = findViewById(R.id.buttonDivide);
     plus = findViewById(R.id.buttonPlus);
     subtract = findViewById(R.id.buttonMinus);
     equal = findViewById(R.id.buttonEqual);

     history = findViewById(R.id.textViewHistory);
     result = findViewById(R.id.textViewResult);
     }
    ***************** */




}
