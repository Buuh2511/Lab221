/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Vector;
import support.FileManipulaiton;

/**
 *
 * @author Buu Huynh
 */
public class ArmorServer extends UnicastRemoteObject implements ArmorInterface {

    //create list for storage
    private List<ArmorDTO> listArmor = null;
    //create file name
    private final String fileName = "ArmorData.txt";

    public ArmorServer() throws RemoteException {
    }

    /**
     * Create armor
     *
     * @param dto
     * @return true or false
     * @throws RemoteException
     */
    @Override
    public boolean createArmor(ArmorDTO dto) throws RemoteException {
        if (findByArmorID(dto.getArmorID()) != null) {
            return false;
        } else {
            listArmor.add(dto);
            FileManipulaiton.writeFile(fileName, (Vector<ArmorDTO>) listArmor);
            return true;
        }
    }

    /**
     * Find armor by ID
     *
     * @param id
     * @return
     * @throws RemoteException
     */
    @Override
    public ArmorDTO findByArmorID(String id) throws RemoteException {
        findAllArmor();
        for (ArmorDTO armorDTO : listArmor) {
            if (armorDTO.getArmorID().matches(id)) {
                return armorDTO;
            }
        }
        return null;
    }

    /**
     * Load all armor
     *
     * @return
     * @throws RemoteException
     */
    @Override
    public List<ArmorDTO> findAllArmor() throws RemoteException {
        listArmor = FileManipulaiton.readFile(fileName);
        return listArmor;
    }

    /**
     * remove armor
     *
     * @param id
     * @return
     * @throws RemoteException
     */
    @Override
    public boolean removeArmor(String id) throws RemoteException {
        ArmorDTO armor = findByArmorID(id);
        listArmor.remove(armor);
        FileManipulaiton.writeFile(fileName, (Vector<ArmorDTO>) listArmor);
        return true;
    }

    @Override
    public boolean updateArmor(ArmorDTO dto) throws RemoteException {
        ArmorDTO armor = findByArmorID(dto.getArmorID());
        listArmor.remove(armor);
        listArmor.add(dto);
        FileManipulaiton.writeFile(fileName, (Vector<ArmorDTO>) listArmor);
        return true;
    }
}
