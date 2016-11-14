#include <stdio.h>
#include "Hellonative.h"

JNIEXPORT void JNICALL Java_HelloNative_sayHello(JNIEnv *, jobject)
{
    printf("Hello World!\n");
}