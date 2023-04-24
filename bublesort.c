void swap(float* p1, float*p2){
	float temp=*p1;
	*p1=*p2; *p2=temp;
}

void bsort(float data[], int size){
	int i,swapping;
	do { 
		swapping=0;
		for(i=0;i<size-1;i++)
			if(data[i]>data[i+1]) {
                		swap(&data[i],&data[i+1]);
                		swapping=1; 
		}
   	}while(swapping);
}

void main(void){
	float d[]={12,34,56,78,43,23,5,7,9,32,23,56};
	int i;
	bsort(d,12);
	for(i=0;i<12;i++)printf("\n%f",d[i]);
}
