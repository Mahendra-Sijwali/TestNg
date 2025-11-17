package testNg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class TestNgRetryEx,
			Constructor TestConstructor, Method login) {
		annotation.setRetryAnalyzer(IRetryClass.class);
	}
}
