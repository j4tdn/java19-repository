-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java19_shopping_diagram_to_sql
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java19_shopping_diagram_to_sql` ;

-- -----------------------------------------------------
-- Schema java19_shopping_diagram_to_sql
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java19_shopping_diagram_to_sql` DEFAULT CHARACTER SET utf8 ;
USE `java19_shopping_diagram_to_sql` ;

-- -----------------------------------------------------
-- Table `java19_shopping_diagram_to_sql`.`ITEM_GROUP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java19_shopping_diagram_to_sql`.`ITEM_GROUP` ;

CREATE TABLE IF NOT EXISTS `java19_shopping_diagram_to_sql`.`ITEM_GROUP` (
  `ID` INT NOT NULL,
  `NAME` VARCHAR(100) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java19_shopping_diagram_to_sql`.`ITEM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java19_shopping_diagram_to_sql`.`ITEM` ;

CREATE TABLE IF NOT EXISTS `java19_shopping_diagram_to_sql`.`ITEM` (
  `ID` INT NOT NULL,
  `MATERIAL` VARCHAR(100) NOT NULL,
  `BUY_PRICE` FLOAT NOT NULL,
  `COLOR` VARCHAR(100) NOT NULL,
  `ITEM_GROUP_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_ITEM_ITEM_GROUP_idx` (`ITEM_GROUP_ID` ASC) VISIBLE,
  CONSTRAINT `fk_ITEM_ITEM_GROUP`
    FOREIGN KEY (`ITEM_GROUP_ID`)
    REFERENCES `java19_shopping_diagram_to_sql`.`ITEM_GROUP` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java19_shopping_diagram_to_sql`.`ODER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java19_shopping_diagram_to_sql`.`ODER` ;

CREATE TABLE IF NOT EXISTS `java19_shopping_diagram_to_sql`.`ODER` (
  `ID` INT NOT NULL,
  `DELIVERY_FEE` FLOAT NOT NULL,
  `CREATED_AT` DATETIME NOT NULL DEFAULT current_timestamp,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java19_shopping_diagram_to_sql`.`ODER_DETAIL`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java19_shopping_diagram_to_sql`.`ODER_DETAIL` ;

CREATE TABLE IF NOT EXISTS `java19_shopping_diagram_to_sql`.`ODER_DETAIL` (
  `ITEM_ID` INT NOT NULL,
  `ODER_ID` INT NOT NULL,
  `ID` INT NOT NULL,
  INDEX `fk_ITEM_has_ODER_ODER1_idx` (`ODER_ID` ASC) VISIBLE,
  INDEX `fk_ITEM_has_ODER_ITEM1_idx` (`ITEM_ID` ASC) VISIBLE,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `UNITE` (`ODER_ID` ASC, `ITEM_ID` ASC) VISIBLE,
  CONSTRAINT `fk_ITEM_has_ODER_ITEM1`
    FOREIGN KEY (`ITEM_ID`)
    REFERENCES `java19_shopping_diagram_to_sql`.`ITEM` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ITEM_has_ODER_ODER1`
    FOREIGN KEY (`ODER_ID`)
    REFERENCES `java19_shopping_diagram_to_sql`.`ODER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
