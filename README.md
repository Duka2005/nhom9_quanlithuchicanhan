# Quản Lý Thu Phí Dịch Vụ Căn Hộ

## Giới Thiệu

Dự án "Quản Lý Thu Chi Cá Nhân" là một ứng dụng Java sử dụng giao diện Swing nhằm hỗ trợ quản lý thông tin thu chi người dùng khi họ thu hoặc chi trong cuộc sống hằng ngày.

### Mục Tiêu

Ứng dụng này được phát triển với mục tiêu:
- Giúp người dùng có thể biết được thu, chi cá nhân trong từng ngày, từng tuần, từng tháng.

## Tính Năng

- **Đăng Nhập**: 
  - Người dùng cần đăng nhập với tài khoản hợp lệ để truy cập vào các chức năng của ứng dụng.
  
- **Quản Lý Thu Chi**: 
  - Nhập và lưu trữ thông tin căn hộ bao gồm:
    - Tuần
    - Tháng
    - Ngày
    - Năm
    - Nội dung thu chi
    - Loại (Người dùng phải nhập thu hoặc chi)
    - Số tiền

- **Tìm Kiếm**: 
  - Tìm kiếm các loại thu hoặc chi theo yêu cầu dựa vào việc tìm kiếm kí tự

## Công Nghệ Sử Dụng

- **Java**: Ngôn ngữ lập trình chính cho ứng dụng.
- **Java Swing**: Thư viện GUI được sử dụng để xây dựng giao diện người dùng.
- **Maven**: Công cụ quản lý dự án và thư viện, nếu cần thiết.

## Cài Đặt

### Bước 1: Cài Đặt JDK

- Tải và cài đặt Java Development Kit (JDK) từ trang chính thức của Oracle: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

### Bước 2: Clone Repository

- Sử dụng Git để clone repository về máy tính của bạn:
   ```bash
   git clone <repository-url>
### Bước 3: Mở Dự Án

- Mở IDE mà bạn ưa thích (IntelliJ IDEA, Eclipse, NetBeans, v.v.) và nhập dự án đã clone.

### Bước 4: Chạy Ứng Dụng
- Chạy file App.java để khởi động ứng dụng.

### Hướng Dẫn Sử Dụng
* Đăng Nhập:

- Khi ứng dụng khởi động, một cửa sổ đăng nhập sẽ xuất hiện. Nhập thông tin tài khoản:
- Tài khoản admin
- Mật khẩu: admin
- Nhấn nút "Đăng nhập". Nếu thông tin đúng, bạn sẽ được chuyển đến giao diện chính.

* Thêm thu/chi của cá nhân:
- Khi vào giao diện chính thì bên phải có các chức năng "Thêm","Sửa","Xóa","Clear","Save" và 1 cái bảng ở bên trái.
- Người dùng sẽ phải nhập thông tin cần nhập vào các dòng cần nhập xong nhấn nút "Thêm" để thêm vào bảng.
- Người dùng phải chọn hàng ở bảng để nó hiện thông tin ở bên phải và thay đổi theo ý mình, sau đó người dùng chỉ cần nhấn "Sửa" là nó sẽ cập nhật thông tin.
- Người dùng phải chọn hàng ở bảng để nó hiện thông tin ở bên phải, sau đó nhấn "Xóa" để xóa thông tin đấy ở bảng.
- Nút "Clear" dùng để xóa thông tin bên phải mà không làm ảnh hưởng đến bảng.
- Vì là thông tin ở bảng là thông tin tạm thời nên sau khi nhập xong thì người dùng cần nhấn "Save" để lưu dữ liệu ra file xml.
 

* Tìm Kiếm:

- Người dùng chỉ cần nhập kí tự cần tìm là bảng sẽ lọc ra những thông tin có những kí tự đấy

* Thống kê theo Ngày/Tháng/Tuần:

- Người dùng nhấn nút "Ngày"/"Tháng"/"Tuần" rồi nhập thông tin và nhấn nút "Thống kê" là có thể hiện thông tin mà trùng khớp thông tin vừa nhập.
- Phía dưới góc bên trái sẽ hiện số tiền thu chi trong Ngày/Tháng/Tuần đấy để người dùng dễ theo dõi.
- Nút "Tắt" để thoát khỏi màn hình Thống kê theo Ngày/Tháng/Tuần.