# EmojiCompatSample
EASY Sample project for using Emojicon (smiley) in your project


## STEP 1: 

Download the project source code by clicking 'clone or download' button. Suppose you have downloaded it in this path: D:\EmojiCompatSample

## STEP 2:

### Import library D:\EmojiCompatSample\lib to your project:

In Android Studio go to File->Project Structure then click on '+' symbol. 
From the dialog box pops up choose appropriate option to import library. 

Then select D:\EmojiCompatSample\lib to import emojion library to your project. It will copy 'emojicon' project to your project.

## STEP 3:

### Set dependency:
Then click on Dependencies tab (in dialog options box from File->Project Structure). 
From the list that appears on left side, click on your project under modules. 
You will see all your project dependencies. 
Now click on '+' symbol from top right corner and select "Module dependency". 
The dialog next will show "lib" as module. 
Just select that and click OK to close dialog. 
Close Project Structure dialog also. 
That's it! You have successfully imported emojicon library and have set its dependency.

## STEP 4:

Use the emojicon library wherever you want to use. Its basically as simple as adding **'EditText' or 'TextView'** in your layout xml file;
replace those with **'github.ankushsachdeva.emojicon.EmojiconTextView' or 'github.ankushsachdeva.emojicon.EmojiconEditText'** respectively.

Enjoy!
