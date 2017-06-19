[33mcommit 633064a779c7f38c606f3d37d7cf55cbe1a0e511[m
Author: Ollie <olimpiu.mihai.popa@gmail.com>
Date:   Mon Jun 12 14:23:51 2017 +0300

     I removed today, the import.util*

[1mdiff --git a/nbproject/private/private.xml b/nbproject/private/private.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..2316c89[m
[1m--- /dev/null[m
[1m+++ b/nbproject/private/private.xml[m
[36m@@ -0,0 +1,10 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project-private xmlns="http://www.netbeans.org/ns/project-private/1">[m
[32m+[m[32m    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>[m
[32m+[m[32m    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">[m
[32m+[m[32m        <group>[m
[32m+[m[32m            <file>file:/media/mihai/Special/Ubuntu's%20file/NetBeans/JavaHomeworkPopaOlimpiu/src/PocketComputer/DisplayBasicComputer.java</file>[m
[32m+[m[32m            <file>file:/media/mihai/Special/Ubuntu's%20file/NetBeans/JavaHomeworkPopaOlimpiu/src/Calculator/Calculator.java</file>[m
[32m+[m[32m        </group>[m
[32m+[m[32m    </open-files>[m
[32m+[m[32m</project-private>[m
[1mdiff --git a/src/Calculator/Calculator.java b/src/Calculator/Calculator.java[m
[1mindex b1050f7..528a022 100644[m
[1m--- a/src/Calculator/Calculator.java[m
[1m+++ b/src/Calculator/Calculator.java[m
[36m@@ -3,12 +3,10 @@[m
  *This is a Simple Computer / Should be treated as such. (Part. II)[m
  */[m
 package Calculator;[m
[31m-[m
[31m-import java.util.*;[m
 import java.util.Scanner;[m
 [m
 /**[m
[31m- * @author Popa Olimpiu Mihai[m
[32m+[m[32m * @author Popa Olimpiu Mihai and Company@.[m
  */[m
 public class Calculator {[m
 [m
[1mdiff --git a/src/PocketComputer/DisplayBasicComputer.java b/src/PocketComputer/DisplayBasicComputer.java[m
[1mindex 8e4c811..753d07b 100644[m
[1m--- a/src/PocketComputer/DisplayBasicComputer.java[m
[1m+++ b/src/PocketComputer/DisplayBasicComputer.java[m
[36m@@ -5,7 +5,7 @@[m
 package PocketComputer;[m
 [m
 /**[m
[31m- * @author Popa Olimpiu Mihai[m
[32m+[m[32m * @author Popa Olimpiu Mihai and Company@.[m
  */[m
 [m
 public class DisplayBasicComputer extends javax.swing.JFrame {[m
