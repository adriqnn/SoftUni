package com.example.xmlprocessing.util.modelMapper;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.ProductCreateBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels.ProductSeedDataDTO;
import com.example.xmlprocessing.model.entity.Product;
import com.example.xmlprocessing.repository.UserRepository;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {

    private final ModelMapper mapper;

    private final UserRepository userRepository;

    public ModelMapperConfig(ModelMapper mapper,
                             UserRepository userRepository) {
        this.mapper = mapper;
        this.userRepository = userRepository;
        this.init();
    }

    private void init() {
        this.productCreateBindingConfiguration();
        this.productXmlCreateBindingConfiguration();
//        this.userSoldItemViewConfiguration();
//        this.categoryByProductsViewConfiguration();
    }

    private void productCreateBindingConfiguration() {
        Converter<ProductCreateBindingModel, Product> con = new AbstractConverter<ProductCreateBindingModel, Product>() {
            @Override
            protected Product convert(ProductCreateBindingModel src) {
                Product p = new Product();
                Integer buyer = src.getBuyer();
                if (buyer != null) {
                    p.setBuyer(userRepository.getOne((long)buyer));
                }
                p.setSeller(userRepository.getOne((long)src.getSeller()));
                p.setName(src.getName());
                p.setPrice(src.getPrice());
                return p;
            }
        };
        this.mapper.addConverter(con);
    }

    private void productXmlCreateBindingConfiguration() {
        Converter<ProductSeedDataDTO, Product> con = new AbstractConverter<ProductSeedDataDTO, Product>() {

            @Override
            protected Product convert(ProductSeedDataDTO src) {
                Product p = new Product();
                Integer buyer = src.getBuyer();
                if (buyer != null) {
                    p.setBuyer(userRepository.getOne((long)buyer));
                }
                p.setSeller(userRepository.getOne((long)src.getSeller()));
                p.setName(src.getName());
                p.setPrice(src.getPrice());
                return p;
            }
        };
        this.mapper.addConverter(con);
    }

//    private void categoryByProductsViewConfiguration() {
//        Converter<Category, CategoryByProductsCountViewModel> con = new AbstractConverter<Category, CategoryByProductsCountViewModel>() {
//
//            @Override
//            protected CategoryByProductsCountViewModel convert(Category source) {
//                CategoryByProductsCountViewModel viewModel = new CategoryByProductsCountViewModel();
//
//                viewModel.setId(source.getId());
//                viewModel.setName(source.getName());
//                viewModel.setProductsCount(source.getProducts().size());
//
//                BigDecimal totalPrice = BigDecimal.ZERO;
//                source.getProducts().forEach(p -> totalPrice.add(p.getPrice()));
//                BigDecimal averagePrice = totalPrice.multiply(BigDecimal.valueOf(source.getProducts().size()));
//                viewModel.setAveragePrice(averagePrice);
//
//                BigDecimal totalRevenge = BigDecimal.ZERO;
//                if (source.getProducts().size() > 0) {
//                    for (Product p : source.getProducts()) {
//                        if (p.getBuyer() != null) {
//                            totalRevenge = totalRevenge.add(p.getPrice());
//                        }
//                    }
//                    viewModel.setTotalRevenue(totalRevenge);
//                } else {
//                    viewModel.setTotalRevenue(BigDecimal.ZERO);
//                }
//
//                return viewModel;
//            }
//        };
//        this.mapper.addConverter(con);
//    }

}
