#include<stdio.h>
void main(){
int i,n,bt,a[n],wt[n],tat[n];
float sumwt=0,sumtat=0;
printf("Enter Number of processes:");
scanf("%d",&n);
for(i=0;i<n;i++){
printf("Enter Burst Time for %d process:",i+1);
scanf("%d",&bt);
a[i]=bt;
if(i==0){
    wt==0;
}
else{
    wt[i]=a[i-1]+wt[i-1];
}
tat[i]=a[i]+wt[i];
sumwt+=wt[i];
sumtat+=tat[i];
}
float avgwt=sumwt/n , avgtat=sumtat/n;
printf("Process\t Burst time\t Waiting time\t Turn Around Time\n");
for(i=0;i<n;i++){
    printf("%d\t\t%d\t\t%d\t\t%d\n",i+1,a[i],wt[i],tat[i]);
}
printf("Average waiting time %f\n",avgwt);
printf("Average turn around time %f\n",avgtat);
}