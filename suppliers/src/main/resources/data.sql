INSERT INTO suppliers.suppliers (name, address, contact) VALUES
                                                             ('Agro Supplier A', '123 Green Road, Farmtown', '+33 6 12 34 56 78'),
                                                             ('EcoFarm Solutions', '456 Eco Street, Greenvillage', '+33 7 98 76 54 32'),
                                                             ('Organic Goods Ltd.', '789 Nature Ave, Countryside', '+33 1 23 45 67 89')
    ON CONFLICT (name) DO NOTHING;
