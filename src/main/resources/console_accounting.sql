CREATE table invoiceOUT(
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `client` varchar(250) NOT NULL,
  `amount` integer NOT NULL,
  `date` date NOT NULL,
  `received` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE table invoiceIN(
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `service` varchar(250) NOT NULL,
  `amount` integer NOT NULL,
  `date` date NOT NULL,
  `paid` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE table user(
    `id` int(10) NOT NULL AUTO_INCREMENT,
    `name` varchar(250) NOT NULL,
    PRIMARY KEY (`id`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8;