package de.mydomain.freemarker.controller;

import de.mydomain.freemarker.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class ProductsController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping("/products")
	public ModelAndView index() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("products");

		List<Product> products = fetchProducts();
		modelAndView.addObject("products", products);

		return modelAndView;
	}

	private List<Product> fetchProducts() {
		Locale locale = LocaleContextHolder.getLocale();

		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setName(messageSource.getMessage("television", null, locale));
		product.setPrice(localizePrice(locale, 15678.43));
		product.setLastUpdated(localizeDate(locale, LocalDate.of(2021, Month.SEPTEMBER, 22)));
		products.add(product);

		product = new Product();
		product.setName(messageSource.getMessage("washingmachine", null, locale));
		product.setPrice(localizePrice(locale, 152637.76));
		product.setLastUpdated(localizeDate(locale, LocalDate.of(2021, Month.SEPTEMBER, 20)));
		products.add(product);

		return products;
	}

	private String localizeDate(final Locale locale, final LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale);
		return formatter.format(date);
	}

	private String localizePrice(final Locale locale, final Double price) {
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		return numberFormat.format(price);
	}


}
