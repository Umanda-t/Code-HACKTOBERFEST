void isort(float d[], int size)
{
    int i,k,l;
    float temp;
    for(k=1;k<size;k++){        // insert elements starting from 2nd
        for(i=0;i<k && d[i]<=d[k];i++);     // find where to insert - ith place
        temp=d[k];                          // copy kth element to temp
        for(l=k;l>i;l--) d[l]=d[l-1];       // shift to make room to insert at ith
        d[i]=temp;                          //insert kth element to ith place
    }                           
}

void main(){
	int i;
	float data[]={9,8,7,6,5,4,-13,2,1,0,1,2,3};
	isort(data,13);
	printf("\n");
	for(i=0;i<13;i++) printf("%f\t",data[i]);
}
