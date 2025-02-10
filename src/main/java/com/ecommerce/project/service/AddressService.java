package com.ecommerce.project.service;

import com.ecommerce.project.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO);

    List<AddressDTO> getAllAddresses();

    AddressDTO getAddressById(Long addressId);

    List<AddressDTO> getAddressesByUser();

    AddressDTO updateAddress(Long addressId, AddressDTO addressDTO);

    AddressDTO deleteAddress(Long addressId);
}
