package main;

import java.util.Scanner;

public class Ejercicios {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void algoritmo1() {
			
		int edad1 = 0, edad2 = 0, edad3 = 0;
		int promedioEdad;
		
		System.out.println("--- PROMEDIO DE EDAD ---\n");
		System.out.println("Ingrese la edad de la primer persona: ");
		edad1 = sc.nextInt();
		 
		System.out.println("Ingrese la edad de la segunda persona: ");
		edad2 = sc.nextInt();
		
		System.out.println("Ingrese la edad de la tercer persona: ");
		edad3 = sc.nextInt();
		
		promedioEdad = (edad1 + edad2 + edad3) / 3;
		
		System.out.println("_______________________________________________\n");
		System.out.println("El promedio de las edades es: " + promedioEdad);
		System.out.println("_______________________________________________");
    }
	
	public static void algoritmo3() {
		
		int sueldoBase, ventaMensual, comision, pagoComision, total;
		
		System.out.println("\n-------------- PAGO COMISIONES --------------\n");
		System.out.print("Ingrese el valor($) de su sueldo base: $");
		sueldoBase = sc.nextInt();
		
		System.out.print("Ingrese la cantidad de ventas del mes: ");
		ventaMensual = sc.nextInt();
		
		comision = (int) (sueldoBase * 0.10);
		pagoComision = ventaMensual * comision;
		
		System.out.println("Valor a recibir por concepto de comisiones: $" + pagoComision);
		
		total = pagoComision + sueldoBase;
		
		System.out.println("Total ($) a recibir: $" + total);
    }
	
	public static void algoritmo5() {
		
		int calificacionP1, calificacionP2, calificacionP3, examenFinal, trabajoFinal;
		int promedioP, examen, trabajo, calificacionFinal;
		
		System.out.println("\n--------- CALIFICACIÓN FINAL - COMPUTACIÓN ---------\n");
		System.out.println("(55%) Ingrese las tres calificaciones parciales. (Rango de 10 a 50)\n");
		System.out.print("Calificación 1: ");
		calificacionP1 = sc.nextInt();
		
		System.out.print("Calificación 2: ");
		calificacionP2 = sc.nextInt();
		
		System.out.print("Calificación 3: ");
		calificacionP3 = sc.nextInt();
		
		promedioP = (int) (((calificacionP1 + calificacionP2 + calificacionP3) / 3 ) * (0.55));
		
		System.out.print("\n(30%) Ingrese la calificación del examen final: ");
		examenFinal = sc.nextInt();
		
		examen = (int) (examenFinal * 0.30);
		
		System.out.print("\n(15%) Ingrese la calificación del trabajo final: ");
		trabajoFinal = sc.nextInt();
		
		trabajo = (int) (trabajoFinal * 0.15);
		
		calificacionFinal = promedioP + examen + trabajo; 
		
		System.out.println("\nCalificación final: " + calificacionFinal);
    }
	
	public static void algoritmo7() {
		
		float cantidadMetros, cantidadMetrosPulgadas, cantidadMetrosPies;
		float Mpulgadas = (float) 39.27;
		float pie = (float) 3.28;
		
		System.out.println("\n----------- Conversión de metros a pulgadas y pies -----------\n");
		System.out.println("Ingrese la cantidad de metros a convertir (Pulgadas y pies): ");
		cantidadMetros = sc.nextInt();
		
		cantidadMetrosPulgadas = cantidadMetros * Mpulgadas;
		cantidadMetrosPies = cantidadMetros * pie;
		
		System.out.println("Cantidad de metros ingresados: " + cantidadMetros + " m");
		System.out.println("Metros ingresados a Pulgadas: " + cantidadMetrosPulgadas + " in");
		System.out.println("Metros ingresados a Pies: " + cantidadMetrosPies + " ft");
    }
	
	public static void algoritmo9() {
        
		int horasTrabajadas = 0;
		double precioHora = 5500;
		double impuestos = 0;
		double sueldoBase = 0;
		double sueldoNeto = 0;
		
		System.out.println("\n -------- SALARIO TRABAJADOR -------- \n");
		System.out.print("Ingrese la cantidad de horas laboradas por el trabajador: ");
		horasTrabajadas = sc.nextInt();
		
		sueldoBase = horasTrabajadas * precioHora;
		impuestos = (sueldoBase * 0.20);
		sueldoNeto = sueldoBase - impuestos;
		
		System.out.println("\n _______________________________________\n");
		System.out.println("* Sueldo base del trabajador: $" + sueldoBase);
		System.out.println("* Descuento del 20% por concepto de impuestos: $" + impuestos);
		System.out.println("\nSalario neto del trabajador: $" + sueldoNeto);
    }
	
	public static void algoritmo11() {
		String nombre;
		int horasTrabajadas, horasExtrasTrabajadas, hijos, asignarPagos;
		double horaNormal = 5200;
		double horaExtra = 7500;
		double sueldoBase, deduc, sueldoNeto, sueldoBaseD;
		
		//Deducciones
		double paroForzoso;
		double politicaHabit;
		double cajaAhorro;
		
		System.out.println("\n---------- ASIGNACIONES, DEDUCCIONES Y SUELDO NETO ----------\n");
		System.out.println("Ingrese el nombre del trabajador: ");
		nombre = sc.next();
		
		System.out.println("Ingrese el numero de horas trabajadas: ");
		horasTrabajadas = sc.nextInt();
		
		System.out.println("Ingrese el numero de horas extras trabajadas: ");
		horasExtrasTrabajadas = sc.nextInt();
		
		System.out.println("Ingrese la cantidad de hijos del trabajador: ");
		hijos = sc.nextInt();
		
		//Se le asignan 17300 por cada más 25000 por actualización académica
		// y prima por hogar de 18000
		asignarPagos = (hijos * 17300) + 25000 + 18000;
		
		System.out.println("Asignaciones: ");
		System.out.println("Por actualización académica, por prima por hogar y");
		System.out.println("por "+ hijos +" hijos se le asignan: $" + asignarPagos);
		
		sueldoBase = (horasTrabajadas * horaNormal) + (horasExtrasTrabajadas * horaExtra);
		System.out.println("Sueldo base del trabajador "+ nombre +": $" + sueldoBase);
		
		paroForzoso = sueldoBase * 0.05;
		politicaHabit = sueldoBase * 0.02;
		cajaAhorro = sueldoBase * 0.07;
		
		deduc = (politicaHabit + paroForzoso + cajaAhorro);
		sueldoBaseD = sueldoBase - deduc;
		
		System.out.println("Deducción por paro forzoso (5%): $"+ paroForzoso);
		System.out.println("Deducción por política habitacional (2%): $"+ politicaHabit);		
		System.out.println("Deducción para caja de ahorro (7%): $"+ cajaAhorro);

		
		System.out.println("Sueldo base con deducciones del trabajador "+ nombre +": $" + sueldoBaseD);
		
		sueldoNeto = sueldoBaseD + asignarPagos;
		
		System.out.println("\nSueldo neto del trabajador "+ nombre +" es de: $" + sueldoNeto);
    }
	
	public static void algoritmo13() {
		int n1, n2, n3, n4, n5, n6, n7, n8, total;
		
		System.out.println("--------- BANCO ---------");
		
        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        n1 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        n2 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        n3 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        n4 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        n5 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        n6 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 500: ");
        n7 = sc.nextInt();

        System.out.print("Ingrese la cantidad de billetes de 100: ");
        n8 = sc.nextInt();

        total = (n1 * 50000) + (n2 * 20000) + (n3 * 10000) + (n4 * 5000) + (n5 * 2000) + (n6 * 1000) + (n7 * 500) + (n8 * 100);

        System.out.println("El total de dinero en el banco es: $" + total);
    }
	
	public static void algoritmo15() {
		int lecturaAnterior, lecturaActual, costoPorKw, kwConsumidos, montoTotal;
        
        System.out.println("\n ----------- KWH MES ----------- \n");
        
        System.out.print("Ingrese la lectura anterior en kilovatios: ");
        lecturaAnterior = sc.nextInt();

        System.out.print("Ingrese la lectura actual en kilovatios: ");
        lecturaActual = sc.nextInt();

        System.out.print("Ingrese el costo por kilovatio: ");
        costoPorKw = sc.nextInt();

        kwConsumidos = lecturaActual - lecturaAnterior;

        montoTotal = kwConsumidos * costoPorKw;

        System.out.println("La cantidad de kilovatios consumidos en el mes es: " + kwConsumidos);
        System.out.println("El monto total a pagar en el mes es: $" + montoTotal);
    }
	
	public static void algoritmo17() {
		int precioFinalPagado, precioVentaPublico, porcentajeDescuento;
        
        System.out.println(" ----------- PORCENTAJE DE DESCUENTO ----------- ");
        
        System.out.print("Ingrese el precio final pagado: ");
        precioFinalPagado = sc.nextInt();

        System.out.print("Ingrese el precio de venta al publico: ");
        precioVentaPublico = sc.nextInt();

        porcentajeDescuento = ((precioVentaPublico - precioFinalPagado) / precioVentaPublico) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + porcentajeDescuento + "%");
    }
	
	public static void algoritmo19() {
		int presupuestoTotal, montoGinecologia, montoTraumatologia, montoPediatra;

        System.out.println("\n----------- HOSPITAL ------------\n");
        
        System.out.print("Ingrese el monto total del presupuesto anual: ");
        presupuestoTotal = sc.nextInt();

        montoGinecologia = (int) (presupuestoTotal * 0.40);
        montoTraumatologia = (int) (presupuestoTotal * 0.30);
        montoPediatra = (int) (presupuestoTotal * 0.30);

        System.out.println("La cantidad de dinero para Ginecología es: $" + montoGinecologia);
        System.out.println("La cantidad de dinero para Traumatología es: $" + montoTraumatologia);
        System.out.println("La cantidad de dinero para Pediatría es: $" + montoPediatra);
    }
	
	public static void algoritmo21() {
		int cantidadNaranjas = 48000;
        double precioPorDocena = 6, costoTotal, ganancia, porcentajeGanancia;
        double ingresoTotal = 42000;

        costoTotal = cantidadNaranjas * (precioPorDocena / 12);

        ganancia = ingresoTotal - costoTotal;

        porcentajeGanancia = (ganancia / costoTotal) * 100;

        System.out.println("\n---------- LOTE DE NARANJAS ----------\n");
        
        System.out.println("El porcentaje de ganancia es: " + porcentajeGanancia + "%");
    }
	
	public static void algoritmo23() {
		int m = 452; // Kilogramos de harina por tonelada
        int n = 197; // Litros de aceite por tonelada
        double B1 = 132; // Precio de cada bulto de harina (24 paquetes)
        double B2 = 180; // Precio de cada caja de aceite (15 envases)
        double B3 = 7.50; // Precio al detal de cada kilogramo de harina
        double B4 = 14.50; // Precio al detal de cada litro de aceite

        double ingresoHarina, ingresoAceite, ingresoTotal, ingresoHarinaDetalle, ingresoAceiteDetalle;
        
        ingresoHarina = (m) * B1;
        ingresoAceite = (n / 15) * B2;
        ingresoTotal = ingresoHarina + ingresoAceite;

        ingresoHarinaDetalle = (m % 24) * B3;
        ingresoAceiteDetalle = (n % 15) * B4; 

        ingresoTotal += ingresoHarinaDetalle + ingresoAceiteDetalle;
        System.out.println("\n------------------ PLANTA PRODUCTORA --------------------\n");
        System.out.println("El ingreso total por la venta de una tonelada de maíz es: " + ingresoTotal);
    }
	
	public static void algoritmo25() {
		double sueldo, porcentajeAumento, aumento ,sueldoFinal;
        
        System.out.println("\n ---------- SUELDO TRABAJADOR ----------\n");
        
        System.out.print("Ingrese el sueldo del trabajador: ");
        sueldo = sc.nextDouble();

        if (sueldo < 40000) {
            porcentajeAumento = 0.15;
        } else {
            porcentajeAumento = 0.12;
        }

        aumento = sueldo * porcentajeAumento;
        sueldoFinal = sueldo + aumento;

        System.out.println("El nuevo sueldo del trabajador es: $" + sueldoFinal);
    }
	
	public static void algoritmo27() {
		double valor1, valor2, valor3;
        double areaTriangulo, areaCirculo, areaRectangulo;
        
        System.out.println("\n ------------ MEDIDAS DE UNA FIGURA ------------ \n");
        
        System.out.print("Ingrese el primer valor: ");
        valor1 = sc.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        valor2 = sc.nextDouble();

        System.out.print("Ingrese el tercer valor: ");
        valor3 = sc.nextDouble();

        areaTriangulo = 0.5 * valor1 * valor2;
        areaCirculo = Math.PI * Math.pow(valor1, 2);
        areaRectangulo = valor1 * valor2;

        if (valor3 == areaTriangulo) {
            System.out.println("Los valores coinciden a un triángulo.");
        } else if (valor3 == areaCirculo) {
            System.out.println("Los valores coinciden a un círculo.");
        } else if (valor3 == areaRectangulo) {
            System.out.println("Los valores coinciden a un rectángulo.");
        } else {
            System.out.println("Los valores no coinciden a ninguna figura.");
        }
    }
	
	public static void algoritmo29() {
		int ventasDepartamento1, ventasDepartamento2, ventasDepartamento3, totalDepartamento1, totalDepartamento2, totalDepartamento3;
        int ventasTotales, limiteIncentivo;
        
        System.out.println("\n ----------- COMERCIALIZADORA DE COSMÉTICOS ----------- \n");

        System.out.print("Ingrese las ventas del primer departamento: ");
        ventasDepartamento1 = (int) sc.nextDouble();

        System.out.print("Ingrese las ventas del segundo departamento: ");
        ventasDepartamento2 = (int) sc.nextDouble();

        System.out.print("Ingrese las ventas del tercer departamento: ");
        ventasDepartamento3 = (int) sc.nextDouble();

        int salarioMensual = 1000;
        ventasTotales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
        limiteIncentivo = (int) (0.33 * ventasTotales);

        int incentivoDepartamento1 = 0;
        int incentivoDepartamento2 = 0;
        int incentivoDepartamento3 = 0;

        if (ventasDepartamento1 > limiteIncentivo) {
            incentivoDepartamento1 = (int) (0.2 * salarioMensual);
        }

        if (ventasDepartamento2 > limiteIncentivo) {
            incentivoDepartamento2 = (int) (0.2 * salarioMensual);
        }

        if (ventasDepartamento3 > limiteIncentivo) {
            incentivoDepartamento3 = (int) (0.2 * salarioMensual);
        }

        totalDepartamento1 = salarioMensual + incentivoDepartamento1;
        totalDepartamento2 = salarioMensual + incentivoDepartamento2;
        totalDepartamento3 = salarioMensual + incentivoDepartamento3;

        System.out.println("_______________________________________________________________________\n");
        System.out.println("Total a recibir en el primer departamento: " + totalDepartamento1);
        System.out.println("Total a recibir en el segundo departamento: " + totalDepartamento2);
        System.out.println("Total a recibir en el tercer departamento: " + totalDepartamento3);
    }
	
	public static void algoritmo31() {
		System.out.println("------- ALQUILER DE AUTOMÓVILES --------\n");
        
        System.out.print("Ingrese la distancia recorrida en kilómetros: ");
        int distancia = sc.nextInt();

        int montoPagar = 5000;

        if (distancia > 300 && distancia <= 1000) {
            montoPagar += 200 * (distancia - 300);
        } else if (distancia > 1000) {
            montoPagar += 200 * 700 + 150 * (distancia - 1000);
        }

        System.out.println("El monto a pagar es: $" + montoPagar);
    }
}
