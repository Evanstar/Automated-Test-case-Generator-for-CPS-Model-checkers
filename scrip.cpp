#include <bits/stdc++.h> 
#include <cstdlib>
#include <stdlib.h>
#include<csignal>
#include <unistd.h> 
#include<sys/types.h>
#include<dirent.h>
#include<stdio.h>
using namespace std;
void signalHandler(int signum){
	cout<<"Interrupt signal ("<< signum <<") received."<<endl; 
	exit(signum);
}
int getFileNos(){
  	DIR *dp;
	int i = 0;
	struct dirent *ep;     
	dp = opendir ("/home/evanstar/eclipse-workspace/src/test3"); // change the path to where the test-case folder is stored 
	if (dp != NULL)
   	{
	    while (ep = readdir (dp))
	      i++;

	    (void) closedir (dp);
	}
	else
	perror ("Couldn't open the directory");

	printf("There's %d files in the current directory.\n", i);

	return i;
} 
int main () 
{ 
    string filename;
    int file_nos,pid,success_no,usuccess_no; 
    string str = "./spaceex -m /home/evanstar/eclipse-workspace/src/test3/"; // change the path to where the test-case folder is stored 
    string path1 = "/home/evanstar/snap/xmlmodels/output3/"; // set the path to where the the output files will be stored 
    string path2 = "/home/evanstar/eclipse-workspace/src/test3/"; // change the path to where the test-case folder is present 
    signal(SIGINT,signalHandler);
    file_nos = getFileNos();
    file_nos = file_nos - 3;
    file_nos = file_nos/2;
    //file_nos = 50;
    cout<<"file numbers: "<<file_nos;	
    for(int i = 1;i <= file_nos;i++){
	    filename = "file"+to_string(i);
	    cout<<endl<<filename<<endl;
	    str = str + filename+".xml -g "+path2+filename+".cfg -o "+path1+filename+".o"+" > "+path1+filename+"_out.txt";  
	    const char *command = str.c_str(); 
	    cout << "\nCompiling file using\n " << command << endl; 
	    cout << "\nRunning file \n"; 
            system(command);
	    filename = "";
	    str = "./spaceex -m /home/evanstar/eclipse-workspace/src/test3/";	// change the path to where the test-case folder is stored 
    }
    return 0; 
} 
