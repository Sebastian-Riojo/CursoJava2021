package pruebasModelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Figura;
import modelo.Rect�ngulo;
import modelo.Tri�ngulo;

class FiguraTest {

	Circulo circuloVac , circuloLlen;
	Rect�ngulo rectVacio , rectLlen;
	Cuadrado cuaVac,cuaLlen;
	Tri�ngulo trinVac, trinLlen;
	
	List<Figura>listaFiguras;
	Set<Figura>setFiguras;
	
	@BeforeEach
	void setUp() throws Exception {
		
		circuloVac = new Circulo();
		circuloLlen = new Circulo("C�rculo", 5f);
		
		rectVacio = new Rect�ngulo();
		rectLlen = new Rect�ngulo("Rect�ngulo", 3f, 4f);
		
		cuaVac = new Cuadrado();
		cuaLlen = new Cuadrado("Cuadrado", 6f);
		
		trinVac = new Tri�ngulo();
		trinLlen = new Tri�ngulo("Tri�ngulo", 3f, 2f, 5f, 4f);
		
		listaFiguras = new ArrayList<Figura>();
		setFiguras = new HashSet<Figura>();
		
		listaFiguras.add(circuloVac);
		listaFiguras.add(circuloLlen);
		listaFiguras.add(rectLlen);
		listaFiguras.add(cuaVac);
		
		setFiguras.add(rectVacio);
		setFiguras.add(cuaLlen);
		setFiguras.add(trinLlen);
		setFiguras.add(trinVac);

	}

	@AfterEach
	void tearDown() throws Exception {
		
		circuloLlen = null; 
		circuloVac = null;
		
		trinLlen = null;
		trinVac = null;
		
		cuaLlen = null;
		cuaVac = null;
		
		rectLlen = null;
		rectVacio = null;
		
		listaFiguras = null;
		setFiguras = null;
		
	}

	@Test
	void testListaEqualsContainsTRUE() {
		
		Circulo circulo = new Circulo();
		Cuadrado cua = new Cuadrado();
		assertTrue(listaFiguras.contains(circulo));
		assertTrue(listaFiguras.contains(cua));
		
	}
	
	@Test
	void testListaEqualsContainsFALSE() {
		
		Circulo circulo = new Circulo("Circulo" , 3f);
		Cuadrado cua = new Cuadrado("Cuadrado" , 5f);
		assertFalse(listaFiguras.contains(circulo));
		assertFalse(listaFiguras.contains(cua));
		
	}
	
	@Test
	public void testListaAdd(){		
		Circulo circulo = new Circulo("Circulo" , 3f);
		Cuadrado cua = new Cuadrado("Cuadrado" , 5f);
		assertTrue(listaFiguras.add(circulo));
		assertTrue(listaFiguras.add(cua));
		System.out.println("Testeo de la LIST : \n");
		System.out.println("listaFiguras : \n" + listaFiguras);
	}
	
	@Test
	void testSetEqualsContainsTRUE() {
		
		Rect�ngulo rect = new Rect�ngulo();
		Cuadrado cua = new Cuadrado("Cuadrado", 6f);
		assertTrue(setFiguras.contains(rect));
		assertTrue(setFiguras.contains(cua));
		
	}
	
	@Test
	void testSetEqualsContainsFALSE() {
		
		Tri�ngulo trin1 = new Tri�ngulo("Tri�ngulo", 1f, 5f, 7f, 3f);
		Tri�ngulo trin2 = new Tri�ngulo("Tri�ngulo", 1f, 5f, 7f, 3f);
		assertFalse(setFiguras.contains(trin1));
		assertFalse(setFiguras.contains(trin2));
		
	}
	
	@Test
	public void testSetAdd(){
		
		Cuadrado cua1 = new Cuadrado("Cuadrado", 7f);
		Cuadrado cua2 = new Cuadrado("Cuadrado", 20f);
		assertTrue(setFiguras.add(cua1));
		assertTrue(setFiguras.add(cua2));
		System.out.println("Testeo del SET : \n");
		System.out.println("setFiguras : \n" + setFiguras);
	}
	
	@Test 
	public void superficieMaxTRUE() {
		
		//Se pintan dos veces debido a que como cada vez que se hace un testeo se 
		//rompe y se vuelve a empezar , no me quedaba de otra que hacer esto ya que es 
		//el metodo toString el que inicializa los metodos de superficie de cada objeto
		
		System.out.println("Testeo para superficie maxima : \n");
		
		System.out.println("setFiguras : \n" + setFiguras);
		System.out.println("listaFiguras : \n" + listaFiguras);
		
		float res = Figura.getMaximaSuperficie();
		
		assertEquals(res,Figura.getMaximaSuperficie());
		
	}
	
	@Test 
	public void superficieMaxFALSE() {
		
		float sup = 20f;
		assertNotEquals(sup,Figura.getMaximaSuperficie());
		
	}
	
	@Test
	public void testCirculo() {
		
		Circulo cir = new Circulo();
		assertEquals(0,cir.getRadio());
		assertEquals("Figura",cir.getNombre());
		
	}
	
	@Test
	public void testCirculoStringFloat() {
		Circulo cir = new Circulo("Circulo", 3f);
		assertEquals("Circulo", cir.getNombre());
		assertEquals(3f, cir.getRadio());
		
	}
	
	@Test
	public void testCuadrado() {
		
		Cuadrado cir = new Cuadrado();
		assertEquals(0,cir.getLado());
		assertEquals("Figura",cir.getNombre());
		
	}
	
	@Test
	public void testCuadradoStringFloat() {
		Cuadrado cir = new Cuadrado("Cuadrado", 3f);
		assertEquals("Cuadrado", cir.getNombre());
		assertEquals(3f, cir.getLado());
		
	}
	
	@Test
	public void testTri�ngulo() {
		
		Tri�ngulo cir = new Tri�ngulo();
		assertEquals(0,cir.getAltura());
		assertEquals("Figura",cir.getNombre());
		assertEquals(0,cir.getBase());
		assertEquals(0, cir.getCateto1());
		assertEquals(0, cir.getCateto2());
		
	}
	
	@Test
	public void testTri�nguloStringFloatFloatFloatFloat() {
		Tri�ngulo cir = new Tri�ngulo("Tri�ngulo",3f,3f,3f,2f);
		assertEquals("Tri�ngulo", cir.getNombre());
		assertEquals(3f, cir.getBase());
		assertEquals(3f, cir.getCateto1());
		assertEquals(3f, cir.getCateto2());
		assertEquals(2f, cir.getAltura());
		
	}
	
	@Test
	public void testRect�ngulo() {
		
		Rect�ngulo cir = new Rect�ngulo();
		assertEquals(0,cir.getAltura());
		assertEquals(0,cir.getBase());
		assertEquals("Figura",cir.getNombre());
		
	}
	
	@Test
	public void testRect�nguloStringFloatFloat() {
		Rect�ngulo cir = new Rect�ngulo("Rect�ngulo",2f,3f);
		assertEquals("Rect�ngulo", cir.getNombre());
		assertEquals(2f, cir.getAltura());
		assertEquals(3f, cir.getBase());
		
	}
	
	@Test
	public void testEqualsCirculoTRUE(){
		Circulo cir = new Circulo();
		assertTrue(circuloVac.equals(cir));
	}
	
	@Test
	public void testEqualsProfesorFalse(){
		Cuadrado cua = new Cuadrado();
		assertFalse(circuloVac.equals(cua));
	}
	
	@Test
	public void testEqualsCuadradoTRUE(){
		Cuadrado cua = new Cuadrado();
		assertTrue(cuaVac.equals(cua));
	}
	
	@Test
	public void testEqualsCuadradoFalse(){
		Circulo cir = new Circulo();
		assertFalse(cuaVac.equals(cir));
	}
	
	@Test
	public void testEqualsTri�nguloTRUE(){
		Tri�ngulo trin = new Tri�ngulo();
		assertTrue(trinVac.equals(trin));
	}
	
	@Test
	public void testEqualsTri�nguloFalse(){
		Circulo cir = new Circulo();
		assertFalse(trinVac.equals(cir));
	}
	
	@Test
	public void testEqualsRect�nguloTRUE(){
		Rect�ngulo rec = new Rect�ngulo();
		assertTrue(rectVacio.equals(rec));
	}
	
	@Test
	public void testEqualsRect�nguloFalse(){
		Circulo cir = new Circulo();
		assertFalse(rectVacio.equals(cir));
	}
	
	@Test
	public void testPerimetroCirculo(){
		Circulo cir = new Circulo("Circulo",3f);
		float per = cir.calcularPer�metro();
		assertEquals(per, 18,84f);
	}
	
	@Test
	public void testPerimetroRect�ngulo(){
		Rect�ngulo rec = new Rect�ngulo("Rect�ngulo",3f,2f);
		float per = rec.calcularPer�metro();
		assertEquals(per, 10f);
	}
	
	@Test
	public void testPerimetroCuadrado(){
		Cuadrado cua = new Cuadrado("Cuadrado" , 3f);
		float per = cua.calcularPer�metro();
		assertEquals(per, 12f);
	}
	
	@Test
	public void testPerimetroTri�ngulo(){
		Tri�ngulo trin = new Tri�ngulo("Tri�ngulo", 3f, 3f, 3f, 2f);
		float per = trin.calcularPer�metro();
		assertEquals(per, 9f);
	}
	
	@Test
	public void testSuperficieTri�ngulo(){
		Tri�ngulo trin = new Tri�ngulo("Tri�ngulo", 3f, 3f, 3f, 2f);
		float per = trin.calcularSuperficie();
		assertEquals(per, 4,5f);
	}
	
	@Test
	public void testSuperficieCuadrado(){
		Cuadrado cua = new Cuadrado("Cuadrado" , 3f);
		float per = cua.calcularSuperficie();
		assertEquals(per, 9f);
	}
	
	@Test
	public void testSuperficieRect�ngulo(){
		Rect�ngulo rec = new Rect�ngulo("Rect�ngulo",3f,2f);
		float per = rec.calcularSuperficie();
		assertEquals(per, 6f);
	}
	
	@Test
	public void testSuperficieCirculo(){
		Circulo cir = new Circulo("Circulo",3f);
		float per = cir.calcularSuperficie();
		assertEquals(per,28,26f);
	}
	
}
