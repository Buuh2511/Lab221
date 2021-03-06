USE [master]
GO
/****** Object:  Database [ItemDB]    Script Date: 11/19/2019 7:26:43 AM ******/
CREATE DATABASE [ItemDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ItemDB', FILENAME = N'E:\IT\Sortware\CN3\PRJ311(Desktop Java Applications)\Work Shops\Workshop 89 database\ItemDB.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ItemDB_log', FILENAME = N'E:\IT\Sortware\CN3\PRJ311(Desktop Java Applications)\Work Shops\Workshop 89 database\ItemDB_log.ldf' , SIZE = 4672KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ItemDB] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ItemDB].[dbo].[sp_fulltext_database] @action = 'disable'
end
GO
ALTER DATABASE [ItemDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ItemDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ItemDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ItemDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ItemDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [ItemDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ItemDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ItemDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ItemDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ItemDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ItemDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ItemDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ItemDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ItemDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ItemDB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ItemDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ItemDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ItemDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ItemDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ItemDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ItemDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ItemDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ItemDB] SET RECOVERY FULL 
GO
ALTER DATABASE [ItemDB] SET  MULTI_USER 
GO
ALTER DATABASE [ItemDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ItemDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ItemDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ItemDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [ItemDB] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ItemDB', N'ON'
GO
ALTER DATABASE [ItemDB] SET QUERY_STORE = OFF
GO
USE [ItemDB]
GO
/****** Object:  Table [dbo].[Items]    Script Date: 11/19/2019 7:26:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Items](
	[itemCode] [nchar](5) NOT NULL,
	[itemName] [nvarchar](50) NULL,
	[supCode] [nvarchar](5) NULL,
	[unit] [nvarchar](10) NULL,
	[price] [int] NULL,
	[supplying] [bit] NULL,
 CONSTRAINT [PK_Items] PRIMARY KEY CLUSTERED 
(
	[itemCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Suppliers]    Script Date: 11/19/2019 7:26:44 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Suppliers](
	[SupCode] [nvarchar](5) NOT NULL,
	[SupName] [nvarchar](30) NULL,
	[Address] [nvarchar](30) NULL,
	[colloborating] [bit] NULL,
 CONSTRAINT [PK_Suppliers] PRIMARY KEY CLUSTERED 
(
	[SupCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E0001', N'Mouse Proview', N'MT', N'block 10', 30, 1)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E0002', N'Keyboard Proview', N'MT', N'block 10', 40, 1)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E0005', N'Main Gigabyte GM34A', N'MT', N'1-unit', 67, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E0007', N'Blank DVD Giga', N'TA', N'block-100', 43, 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'HS', N'Ho Se', N'12, Tran Phu, Q3', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'HT', N'Hoang Tuan Co.', N'452 Tran Hung Dao, Q5, HCM', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'MA', N'Ma A', N'sddsdg,23', 0)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'MT', N'Minh Trang Co.', N'37, Hai Ba Trung, Q1', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'TA', N'Thien An ', N'123, Le Loi, Q1', 0)
ALTER TABLE [dbo].[Items]  WITH CHECK ADD  CONSTRAINT [FK_Items_Suppliers] FOREIGN KEY([supCode])
REFERENCES [dbo].[Suppliers] ([SupCode])
GO
ALTER TABLE [dbo].[Items] CHECK CONSTRAINT [FK_Items_Suppliers]
GO
USE [master]
GO
ALTER DATABASE [ItemDB] SET  READ_WRITE 
GO
