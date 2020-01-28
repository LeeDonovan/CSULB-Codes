//vuln.c
#include <stdio.h> 
#include <string.h>
int main(int argc, char **argv) {     
	// Make some stack information     
	char a[100], b[100], c[100], d[100];     
	// Call the exploitable function     
	exploitable(argv[1]);     
	// Return everything is OK     
	return(0); }

int exploitable(char *arg) {  
	// Make some stack space
	char buffer[10];  
	// Now copy the buffer  
	strcpy(buffer, arg);  
	printf("The buffer says .. [%s/%p].\n", buffer, &buffer);  
	// Return everything fun  
	return(0); }