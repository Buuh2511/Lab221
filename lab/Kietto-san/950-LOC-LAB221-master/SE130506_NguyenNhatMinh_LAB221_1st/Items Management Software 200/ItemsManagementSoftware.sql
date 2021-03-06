USE [master]
GO
/****** Object:  Database [ItemsManagementSoftware]    Script Date: 11/19/2019 9:15:50 AM ******/
CREATE DATABASE [ItemsManagementSoftware]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ItemsManagementSoftware', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ItemsManagementSoftware.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ItemsManagementSoftware_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ItemsManagementSoftware_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ItemsManagementSoftware] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ItemsManagementSoftware].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ItemsManagementSoftware] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET ARITHABORT OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ItemsManagementSoftware] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ItemsManagementSoftware] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ItemsManagementSoftware] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ItemsManagementSoftware] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ItemsManagementSoftware] SET  MULTI_USER 
GO
ALTER DATABASE [ItemsManagementSoftware] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ItemsManagementSoftware] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ItemsManagementSoftware] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ItemsManagementSoftware] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ItemsManagementSoftware] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ItemsManagementSoftware] SET QUERY_STORE = OFF
GO
USE [ItemsManagementSoftware]
GO
/****** Object:  Table [dbo].[Items]    Script Date: 11/19/2019 9:15:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Items](
	[itemCode] [nchar](10) NOT NULL,
	[itemName] [nvarchar](50) NULL,
	[supCode] [nvarchar](5) NULL,
	[unit] [nvarchar](50) NULL,
	[price] [int] NULL,
	[supplying] [bit] NULL,
 CONSTRAINT [PK_Items] PRIMARY KEY CLUSTERED 
(
	[itemCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Suppliers]    Script Date: 11/19/2019 9:15:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Suppliers](
	[supCode] [nvarchar](5) NOT NULL,
	[supName] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[colloborating] [bit] NULL,
 CONSTRAINT [PK_Suppliers] PRIMARY KEY CLUSTERED 
(
	[supCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Items]  WITH CHECK ADD  CONSTRAINT [FK_Items_Suppliers] FOREIGN KEY([supCode])
REFERENCES [dbo].[Suppliers] ([supCode])
GO
ALTER TABLE [dbo].[Items] CHECK CONSTRAINT [FK_Items_Suppliers]
GO
USE [master]
GO
ALTER DATABASE [ItemsManagementSoftware] SET  READ_WRITE 
GO
