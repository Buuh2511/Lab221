USE [master]
GO
/****** Object:  Database [ItemDB]    Script Date: 11/19/2019 7:12:02 AM ******/
CREATE DATABASE [ItemDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ItemDB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\ItemDB.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ItemDB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\ItemDB_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ItemDB] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ItemDB].[dbo].[sp_fulltext_database] @action = 'enable'
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
ALTER DATABASE [ItemDB] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ItemDB] SET  MULTI_USER 
GO
ALTER DATABASE [ItemDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ItemDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ItemDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ItemDB] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ItemDB] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ItemDB] SET QUERY_STORE = OFF
GO
USE [ItemDB]
GO
/****** Object:  Table [dbo].[Items]    Script Date: 11/19/2019 7:12:02 AM ******/
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
/****** Object:  Table [dbo].[Suppliers]    Script Date: 11/19/2019 7:12:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Suppliers](
	[SupCode] [nvarchar](5) NOT NULL,
	[SupName] [nvarchar](50) NULL,
	[Address] [nvarchar](50) NULL,
	[colloborating] [bit] NULL,
 CONSTRAINT [PK_Suppliers] PRIMARY KEY CLUSTERED 
(
	[SupCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'A11  ', N'phone', N'CC', N'2', 200000, 1)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'A22  ', N'laptop', N'AA', N'6', 300000, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'A33  ', N'headpphone', N'DD', N'2', 100000, 1)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'b22  ', N'dsf', N'EE', N'cxc', 154, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E1234', N'TR', N'AA', N'dsa', 123243, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'E4334', N'r', N'AA', N'Un', 12, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'F21  ', N'vcvx', N'AA', N'vvcx', 2, 0)
INSERT [dbo].[Items] ([itemCode], [itemName], [supCode], [unit], [price], [supplying]) VALUES (N'R55  ', N'loc', N'AA', N'fdsf', 112, 0)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'AA', N'Tin', N'dasdas', 0)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'BB', N'Can', N'vcvxcvxcvx', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'CC', N'Phuc', N'dsdscds', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'DD', N'Hung', N'csccxz', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'EE', N'Loc', N'csdcsd', 1)
INSERT [dbo].[Suppliers] ([SupCode], [SupName], [Address], [colloborating]) VALUES (N'OO', N'Open', N'vcxv', 0)
ALTER TABLE [dbo].[Items]  WITH CHECK ADD  CONSTRAINT [FK_Items_Suppliers1] FOREIGN KEY([supCode])
REFERENCES [dbo].[Suppliers] ([SupCode])
GO
ALTER TABLE [dbo].[Items] CHECK CONSTRAINT [FK_Items_Suppliers1]
GO
USE [master]
GO
ALTER DATABASE [ItemDB] SET  READ_WRITE 
GO
