bool isValid(char* s) {
    char *stack=(char *)malloc(strlen(s)*sizeof(char));
    int top=-1;
    for(int i=0;s[i]!='\0';i++){
        char c=s[i];
        if(c=='('||c=='{'||c=='[')
            stack[++top]=c;
        else{
            if(top==-1)
            return false;
            char t=stack[top--];
            if(c==')'&&t!='('||c==']'&&t!='['||c=='}'&&t!='{')
            return false;
        }
    }
    free(stack);
    return top==-1;
}