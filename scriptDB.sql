-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema portfolio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema portfolio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `portfolio` DEFAULT CHARACTER SET utf8 ;
USE `portfolio` ;

-- -----------------------------------------------------
-- Table `portfolio`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `rol` VARCHAR(45) NULL,
  PRIMARY KEY (`idusers`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`person` (
  `idperson` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `backImage` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `skills` VARCHAR(500) NULL,
  `description` VARCHAR(200) NULL,
  `ubication` VARCHAR(45) NULL,
  PRIMARY KEY (`idperson`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`experience`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`experience` (
  `idexperience` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `img` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `task` VARCHAR(200) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idexperience`),
  INDEX `fk_experience_person1_idx` (`person_idperson` ASC) VISIBLE,
  CONSTRAINT `fk_experience_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `portfolio`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`education`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`education` (
  `ideducation` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `img` VARCHAR(45) NULL,
  `title` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `obs` VARCHAR(45) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`ideducation`),
  INDEX `fk_education_person_idx` (`person_idperson` ASC) VISIBLE,
  CONSTRAINT `fk_education_person`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `portfolio`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portfolio`.`abilities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`abilities` (
  `idabilities` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `skill` VARCHAR(45) NULL,
  `color` VARCHAR(45) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idabilities`),
  INDEX `fk_abilities_person1_idx` (`person_idperson` ASC) VISIBLE,
  CONSTRAINT `fk_abilities_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `portfolio`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `portfolio`.`projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `portfolio`.`projects` (
  `idprojects` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `date` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `link` VARCHAR(45) NULL,
  `observation` VARCHAR(500) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idprojects`),
  INDEX `fk_projects_person1_idx` (`person_idperson` ASC) VISIBLE,
  CONSTRAINT `fk_projects_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `portfolio`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
